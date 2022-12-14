package br.com.xyz.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Collections {

	public static void main(String[] args) {
		System.out.println("Collection");

		Collection<String> c = new ArrayList<>();
		c.add("A");
		c.add("B");
		c.add("C");
		c.add("D");
		c.add("F");
		System.out.println(c.toString());
		System.out.println(c.isEmpty());
		System.out.println(c.contains("C"));
		c.remove("D");
		System.out.println(c.toString());

		// Groups
		Collection<String> c2 = Arrays.asList("S", "W");
		c.addAll(c2);
		System.out.println(c.toString());
		System.out.println(c.containsAll(c2));
		c.removeAll(c2);
		System.out.println(c.toString());

		// Go through the elements
		for (String string : c) {
			System.out.println(string);
		}

		// Converting collection to array
		String[] s = c.toArray(new String[c.size()]);
		System.out.println(Arrays.toString(s));

		c.clear();
		System.out.println(c);

	}

}
