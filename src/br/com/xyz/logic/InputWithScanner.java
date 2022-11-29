package br.com.xyz.logic;
import java.util.Scanner;

public class InputWithScanner {
	public static void main(String[] args) {
		System.out.println("Using the Scanner class");
		
		Scanner s = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = s.nextLine();
		System.out.println("Welcome " + name);
	}
}
