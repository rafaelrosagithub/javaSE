package br.com.xyz.java;

import java.util.Calendar;
import java.util.Date;

public class Dates {

	public static void main(String[] args) {
		System.out.println("Date, Calendar, get, set, clear, add and roll");

		// January 1, 1970
		System.out.println(System.currentTimeMillis());

		Date now = new Date();
		System.out.println(now);

		Date date1 = new Date(1_000_000_000_000L);
		System.out.println(date1);

		// Methods
		System.out.println(date1.getTime());
		date1.setTime(1_700_000_000_000L);
		System.out.println(date1);
		System.out.println(date1.compareTo(now)); // -1 <, 0 ==, 1 >

		Calendar c = Calendar.getInstance(); // new GregorianCalendar()
		System.out.println(c.getTime());
		c.set(2022, Calendar.OCTOBER, 31);

		// Get
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)); // Month 0-11
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));

		// Set
		c.set(Calendar.YEAR, 1970);
		c.set(Calendar.MONTH, Calendar.MAY);
		c.set(Calendar.DAY_OF_MONTH, 10);
		System.out.println(c.getTime());

		// Clear
		c.clear(Calendar.MINUTE);
		c.clear(Calendar.SECOND);
		System.out.println(c.getTime());

		// Add
		c.add(Calendar.DAY_OF_MONTH, 5);
		c.add(Calendar.YEAR, 5);
		System.out.println(c.getTime());
		c.add(Calendar.YEAR, -2);
		System.out.println(c.getTime());

		// Roll
		c.roll(Calendar.DAY_OF_MONTH, 20);
		System.out.println(c.getTime());
		c.roll(Calendar.DAY_OF_MONTH, -20);
		System.out.println(c.getTime());

		Calendar c2 = Calendar.getInstance();
		int hour = c2.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour + " Hours");
		if (hour <= 12) {
			System.out.println("Good Morning!");
		} else if (hour > 12 && hour < 18) {
			System.out.println("Good Afteernoon!");
		} else {
			System.out.println("Good Evening!");
		}
	}

}
