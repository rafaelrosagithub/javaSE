package br.com.xyz.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextAreaControl extends JFrame implements ActionListener {

	JTextArea text;

	public TextAreaControl() {
		super("Text Area Control");

		text = new JTextArea();
		JScrollPane scroll = new JScrollPane(text);
		text.setFont(new Font("Serif", Font.PLAIN, 26));

		JButton button = new JButton("Open File");
		button.setFont(new Font("Serif", Font.PLAIN, 26));
		button.addActionListener(this);

		Container c = getContentPane();
		c.add(BorderLayout.CENTER, scroll);
		c.add(BorderLayout.SOUTH, button);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(380, 380);
		setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println("Text Area Control");

		new TextAreaControl();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser c = new JFileChooser();
		c.showOpenDialog(this);
		File file = c.getSelectedFile();
		try {
			Path path = Paths.get(file.getAbsolutePath());
			String bytesString = new String(Files.readAllBytes(path));
			text.setText(bytesString);
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "There was a problem");
			e2.printStackTrace();
		}
	}

}
