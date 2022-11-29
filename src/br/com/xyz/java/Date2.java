package br.com.xyz.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date2 {

	public static void main(String[] args) {
		System.out.println("Date, Formatting, DateFormat, format and parse");

		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 17);
		Date date = c.getTime();
		System.out.println(date);

		// Date formatting
		DateFormat f1 = DateFormat.getDateInstance();
		System.out.println(f1.format(date));

		// Time formatting
		DateFormat f2 = DateFormat.getTimeInstance();
		System.out.println(f2.format(date));

		// Date and Time formatting
		DateFormat f3 = DateFormat.getDateTimeInstance();
		System.out.println(f3.format(date));

		// Styles
		f1 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f1.format(date));
		f1 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(f1.format(date));
		f1 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(f1.format(date));
		f1 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(f1.format(date));

		// Parse
		try {
			Date date2 = f1.parse("17/02/1980");
			System.out.println(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(date));
		try {
			System.out.println(sdf.parse("10/10/2000"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
