package br.com.xyz.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckControl extends JFrame {

	JTextField text;
	JCheckBox bold, italic;
	int fontSize = 28;

	public CheckControl() {
		super("Check Control");

		text = new JTextField("Dynamically changing font", 15);
		text.setFont(new Font("Serif", Font.PLAIN, fontSize));

		bold = new JCheckBox("Bold");
		bold.addItemListener(new CheckListener());
		italic = new JCheckBox("Italic");
		italic.addItemListener(new CheckListener());

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(text);
		c.add(bold);
		c.add(italic);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
	}

	class CheckListener implements ItemListener { 

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (bold.isSelected() && italic.isSelected()) {
				text.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, fontSize));
			} else if (bold.isSelected()) {
				text.setFont(new Font("Serif", Font.BOLD, fontSize));
			} else if (italic.isSelected()) {
				text.setFont(new Font("Serif", Font.ITALIC, fontSize));
			} else {
				text.setFont(new Font("Serif", Font.PLAIN, fontSize));
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Check Control");

		new CheckControl();
	}

}
