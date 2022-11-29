package br.com.xyz.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame {

	public Window() {
		super("My Window");
		JButton button = new JButton("Click");
		getContentPane().add(button);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println("GUI, Introduction JFrame");

		new Window();
	}

}
