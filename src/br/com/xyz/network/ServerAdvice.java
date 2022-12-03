package br.com.xyz.network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerAdvice {

	public static void main(String[] args) throws IOException {
		System.out.println("Server Advice");

		ServerSocket server = new ServerSocket(5000);

		while (true) {
			Socket socket = server.accept();
			try (PrintWriter w = new PrintWriter(socket.getOutputStream())) {
				w.println("Server Advice Response");
			}
		}
	}

}
