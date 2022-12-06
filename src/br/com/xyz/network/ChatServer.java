package br.com.xyz.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {

	public ChatServer() {
		ServerSocket server;
		try {
			server = new ServerSocket(5000);
			while (true) {
				Socket socket = server.accept();
				new Thread(new ListenCustomer(socket)).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
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
