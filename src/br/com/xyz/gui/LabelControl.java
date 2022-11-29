package br.com.xyz.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelControl extends JFrame {

	public LabelControl() {
		super("Label Control");

		JLabel simple = new JLabel("Label Simple");
		simple.setToolTipText("My Tooltip");

		Font font = new Font("serif", Font.BOLD | Font.ITALIC, 30);
		JLabel label = new JLabel("Label Simple ");
		label.setFont(font);
		label.setForeground(Color.BLUE);

		ImageIcon icon = new ImageIcon(getClass().getResource("images/java-thumb.png"));
		JLabel image = new JLabel(icon);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(simple);
		c.add(label);
		c.add(image);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(460, 460);
		setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println("Label Control");

		new LabelControl();
	}

}
