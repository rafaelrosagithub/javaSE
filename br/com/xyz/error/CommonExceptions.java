package br.com.xyz.erros;

import br.com.xyz.extend.Animal;
import br.com.xyz.extend.Chiken;
import br.com.xyz.extend.Dog;

public class CommonExceptions {

	static int[] arrayNull;
	static int[] array2 = new int[1];

	public static void main(String[] args) {
		System.out.println("Common Exceptions");

		// NullPointerException
		// System.out.println(arrayNull.length);

		// ArithmeticException
		// int x = 7 / 0;

		// ArrayIndexOutOfBoundsException
		// System.out.println(array2[1]);
		// System.out.println(array2[-1]);

		Animal a = new Chiken();
		Chiken c = (Chiken) a; // Ok

		// ClassCastException
		// Dog d = (Dog) a;

		// NumberFormatException
		// int i= Integer.parseInt("x");

	}

}
