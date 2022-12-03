package br.com.xyz.network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientAdvice {

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("Client Advice");

		Socket socket = new Socket("127.0.0.1", 5000);
		Scanner s = new Scanner(socket.getInputStream());
		System.out.println("Server Message: " + s.nextLine());
		s.close();
	}
}
