package br.com.xyz.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {

	public Calculator() {
		super("Calculator");

		Container n = new JPanel();
		n.setLayout(new GridLayout(4, 4, 5, 5));
		n.add(new JButton("7"));
		n.add(new JButton("8"));
		n.add(new JButton("9"));
		n.add(new JButton("/"));
		n.add(new JButton("4"));
		n.add(new JButton("5"));
		n.add(new JButton("6"));
		n.add(new JButton("*"));
		n.add(new JButton("1"));
		n.add(new JButton("2"));
		n.add(new JButton("3"));
		n.add(new JButton("-"));
		n.add(new JButton("0"));
		n.add(new JButton("."));
		n.add(new JButton("="));
		n.add(new JButton("+"));

		JTextField display = new JTextField();
		display.setFont(new Font("serif", Font.PLAIN, 30));
		
		Container c = getContentPane();
		c.add(BorderLayout.NORTH, display);
		c.add(BorderLayout.CENTER, n);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 350);
		setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println("Calculator");

		new Calculator();
	}

}
