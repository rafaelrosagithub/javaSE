package br.com.xyz.refined;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Nesting extends JFrame {

	JButton button;

	public Nesting() {
		super("Nesting");

		button = new JButton("Ok");
		button.addActionListener(new NestedListener());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 450);
		setVisible(true);
	}

	public class NestedListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Nested class execute " + button.getText());

		}

	}

	public static void main(String[] args) {
		System.out.println("Nested Classes");
	}

}
