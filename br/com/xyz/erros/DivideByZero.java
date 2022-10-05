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
			} catch (InputMismatchException e1) {
				System.err.println("Numbers must be of type int");
				s.nextLine();
			} catch (ArithmeticException e2) {
				System.err.println("Divisor must be non-zero");
				s.nextLine();
			} finally {
				System.out.println("Finally executed!");
			}
		} while (condition);
	}

}
