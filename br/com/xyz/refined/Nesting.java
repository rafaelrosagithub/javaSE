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
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Anonymous class executed " + button.getText());
			}
		});

		getContentPane().add(button);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 450);
		setVisible(true);
	}

	public class NestedListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Nested class executed " + button.getText());
		}
	}

	public static void main(String[] args) {
		System.out.println("Nested Classes");
		Nesting window = new Nesting();
	}

}
