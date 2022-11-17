package br.com.xyz.collection;

import java.util.ArrayList;
import java.util.Collection;

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
		
		
	}

}
