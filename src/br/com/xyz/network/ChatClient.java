package br.com.xyz.network;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChatClient extends JFrame {

	JTextField textToSend;
	Socket socket;
	PrintWriter writer;
	String name;

	public ChatClient(String name) {
		super("Chat: " + name);
		this.name = name;

		Font font = new Font("Serif", Font.PLAIN, 18);
		textToSend = new JTextField();
		textToSend.setFont(font);
		JButton button = new JButton("Send");
		button.setFont(font);
		button.addActionListener(new SendListener());

		Container send = new JPanel();
		send.setLayout(new BorderLayout());
		send.add(BorderLayout.CENTER, textToSend);
		send.add(BorderLayout.EAST, button);
		getContentPane().add(BorderLayout.SOUTH, send);

		configNetwork();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 90);
		setVisible(true);
	}

	private class SendListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			writer.println(name + " : " + textToSend.getText());
			writer.flush();
			textToSend.setText("");
			textToSend.requestFocus();
		}

	}

	private void configNetwork() {
		try {
			socket = new Socket("127.0.0.1", 5000);
			writer = new PrintWriter(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("ChatClient");

		new ChatClient("Peter");
		new ChatClient("Jhon");
	}

}
