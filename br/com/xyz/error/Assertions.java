package br.com.xyz.error;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a number between 0 and 10");
		int number = s.nextInt();

		assert (number >= 0 && number <= 10) : "Invalid number";

		System.out.println("Number: " + number);
	}
	
	// Run at command prompt java -ea br.com.xyz.error.Assertions

}
