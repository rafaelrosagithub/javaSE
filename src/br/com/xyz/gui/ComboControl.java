package br.com.xyz.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboControl extends JFrame implements ItemListener {

	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] images = { new ImageIcon(getClass().getResource("images/linux.jpg")),
			new ImageIcon(getClass().getResource("images/panda.jpg")),
			new ImageIcon(getClass().getResource("images/sun.jpg")),
			new ImageIcon(getClass().getResource("images/super-mario.jpg")), };

	public ComboControl() {
		super("Photo Album");
		Container c = getContentPane();
		combo = new JComboBox<String>();
		combo.setFont(new Font("Serif", Font.PLAIN, 26));
		combo.addItem("1");
		combo.addItem("2");
		combo.addItem("3");
		combo.addItem("4");
		combo.addItemListener(this);

		label = new JLabel(images[0]);

		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(420, 540);
		setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println("Combo Control");

		new ComboControl();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			label.setIcon(images[combo.getSelectedIndex()]);
		}

	}
}
