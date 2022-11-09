package br.com.xyz.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextControl extends JFrame implements ActionListener {

	JTextField login;
	JPasswordField password;

	JButton ok, cancel;

	public TextControl() {
		super("Text and Passwords");

		login = new JTextField();
		password = new JPasswordField();

		ok = new JButton("Ok");
		ok.addActionListener(this);

		cancel = new JButton("Cancel");
		cancel.addActionListener(this);

		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 2));
		c.add(new JLabel("Login:"));
		c.add(login);
		c.add(new JLabel("Password"));
		c.add(password);
		c.add(ok);
		c.add(cancel);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 350);
		setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println("Text Control");

		new TextControl();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ok) {
			System.out.println("Button Ok");
			String s = "Login: " + login.getText() + "\nSenha: " + new String(password.getPassword());
			JOptionPane.showMessageDialog(null, s);
		} else if (e.getSource() == cancel) {
			System.out.println("Button Cancel");
			login.setText("");
			password.setText("");
		}

	}

}
