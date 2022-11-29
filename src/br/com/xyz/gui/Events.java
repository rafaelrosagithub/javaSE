package br.com.xyz.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Events extends JFrame implements ActionListener {

	JButton button;

	public Events() {
		super("Events");

		button = new JButton("Click");
		button.addActionListener(this);
		getContentPane().add(button);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println("Events and Listeners");
		new Events();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		button.setText("Was clicked");
	}

}
