package br.com.xyz.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		System.out.println("Divide by zero");

		Scanner s = new Scanner(System.in);

		boolean condition = true;

		do {
			try {
				System.out.println("Number: ");
				int a = s.nextInt();
				System.out.println("Divider: ");
				int b = s.nextInt();
				System.out.println(a / b);
				condition = false;
			} catch (InputMismatchException | ArithmeticException e1) {
				System.err.println("Number invalid");
				s.nextLine();
			} finally {
				System.out.println("Finally executed!");
			}
		} while (condition);
	}

}
