package br.com.xyz.logic;
import javax.swing.JOptionPane;

public class InputWithJOptionPane {
	public static void main(String[] args) {
		System.out.println("Input with JOptionPane");
		
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Welcome! " + name);
	}		
}	