package br.com.xyz.java;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Number {

	public static void main(String[] args) {
		System.out.println("NumberFormat, parse, Internationalization");

		double balance = 300_400.537;

		NumberFormat f = NumberFormat.getInstance();
		System.out.println(f.format(balance)); // Generics

		f = NumberFormat.getIntegerInstance(); // Integers
		System.out.println(f.format(balance));

		f = NumberFormat.getPercentInstance(); // Percentage
		System.out.println(f.format(0.37));

		f = NumberFormat.getCurrencyInstance(); // Coins
		System.out.println(f.format(balance));

		f.setMaximumFractionDigits(3);
		System.out.println(f.format(balance));

		// Internationalization
		f = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(f.format(balance));

		f = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println(f.format(balance));

		f = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println(f.format(balance));

		f = NumberFormat.getCurrencyInstance(Locale.JAPANESE);
		System.out.println(f.format(balance));

		f = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println(f.format(balance));

		f = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		System.out.println(f.format(balance));

		f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(f.format(balance));

		f = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(f.format(balance));

		// Parse
		f = NumberFormat.getCurrencyInstance(Locale.US);
		try {
			System.out.println(f.parse("$3.577,77"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
