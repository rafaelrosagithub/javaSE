package br.com.xyz.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		System.out.println("Collection Set");

		String[] colors = { "yellow", "green", "black", "white", "blue", "black", "yellow" };

		List<String> list = Arrays.asList(colors);
		System.out.println(list);

		Set<String> set = new HashSet<>(list);
		System.out.println(set);
	}
}
