package br.com.xyz.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Layouts2 extends JFrame {

	public Layouts2() {
		super("layouts 2");
		Container c = getContentPane();
		c.setLayout(new BorderLayout(3, 3));

		Container c2 = new JPanel();

//		c.setLayout(new BorderLayout(5, 5));
//		c.add(BorderLayout.NORTH, new JButton("N"));
//		c.add(BorderLayout.SOUTH, new JButton("S"));
//		c.add(BorderLayout.CENTER, new JButton("C"));
//		c.add(BorderLayout.WEST, new JButton("W"));
//		c.add(BorderLayout.EAST, new JButton("W"));

//		c.setLayout(new GridLayout(2, 3));
//		c.add(new JButton("1"));
//		c.add(new JButton("2"));
//		c.add(new JButton("3"));
//		c.add(new JButton("4"));
//		c.add(new JButton("5"));
//		c.add(new JButton("6"));

		c.add(BorderLayout.CENTER, new JButton("Center"));
		c.add(BorderLayout.EAST, c2);

		c2.setLayout(new GridLayout(4, 1));
		c2.add(new JButton("OK"));
		c2.add(new JButton("Cancel"));
		c2.add(new JButton("Setup"));
		c2.add(new JButton("Config"));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 450);
		setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println("Layouts, GridLayout and Composition");

		new Layouts2();
	}

}
