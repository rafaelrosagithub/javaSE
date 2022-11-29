package br.com.xyz.java;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Date3 {

	public static void main(String[] args) {
		System.out.println("Date, Internationalization, Locale");

		Calendar c = Calendar.getInstance();
		c.set(1970, Calendar.MAY, 10);
		Date date = c.getTime();
		System.out.println(date);

		// Language (ISO 639)
		// Country (ISO 3166)
		Locale pattern = Locale.getDefault();
		System.out.println(pattern);
		DateFormat f1 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f1.format(date));

		Locale india = new Locale("hi", "IN"); // India
		System.out.println(india);
		DateFormat f2 = DateFormat.getDateInstance(DateFormat.FULL, india);
		System.out.println(f2.format(date));

		Locale usa = Locale.US; // USA
		System.out.println(usa);
		DateFormat f3 = DateFormat.getDateInstance(DateFormat.FULL, usa);
		System.out.println(f3.format(date));

		Locale japan = Locale.JAPAN; // Japan
		System.out.println(japan);
		DateFormat f4 = DateFormat.getDateInstance(DateFormat.FULL, japan);
		System.out.println(f4.format(date));

		Locale italy = Locale.ITALIAN; // Italy
		System.out.println(italy);
		DateFormat f5 = DateFormat.getDateInstance(DateFormat.FULL, italy);
		System.out.println(f5.format(date));
	}
}
