package br.com.xyz.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UtilityCollection {

	public static void main(String[] args) {
		System.out.println("Utility Collection");

		List<String> list = new ArrayList<>();
		list.add("Guarana");
		list.add("Grap");
		list.add("Mango");
		list.add("Coconut");
		list.add("Açai");
		list.add("Banana");
		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);

		Collections.reverse(list);
		System.out.println(list);

		Collections.shuffle(list);
		System.out.println(list);

		Collections.addAll(list, "Orange", "Apple", "Orange");
		System.out.println(list);
		System.out.println(Collections.frequency(list, "Orange"));

		List<String> list2 = Arrays.asList("Guava", "Strawberry");
		boolean d = Collections.disjoint(list, list2);
		System.out.println(d);

		Collections.sort(list);
		System.out.println(list);
		int index = Collections.binarySearch(list, "Grap");
		System.out.println(index);

		Collections.fill(list, "Cocoa");
		System.out.println(list);

		// Non-modifiable collection
		Collection<String> constant = Collections.unmodifiableCollection(list);
		System.out.println(constant);

	}

}
