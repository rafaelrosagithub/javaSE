package br.com.xyz.network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServer {

	List<PrintWriter> writers = new ArrayList<>();

	public ChatServer() {
		ServerSocket server;
		try {
			server = new ServerSocket(5000);
			while (true) {
				Socket socket = server.accept();
				new Thread(new ListenCustomer(socket)).start();
				PrintWriter p = new PrintWriter(socket.getOutputStream());
				writers.add(p);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void forwardToAll(String text) {
		for (PrintWriter w : writers) {
			try {
				w.println(text);
				w.flush();
			} catch (Exception e) {
			}
		}
	}

	private class ListenCustomer implements Runnable {

		Scanner reader;

		public ListenCustomer(Socket socket) {
			try {
				reader = new Scanner(socket.getInputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			try {
				String text;
				while ((text = reader.nextLine()) != null) {
					System.out.println(text);
					forwardToAll(text);
				}
			} catch (Exception e) {
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("ChatServer");
		new ChatServer();
	}

}
