package br.com.xyz.collection;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {
		System.out.println("List Collection");

		List<String> list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("f");
		list.add("g");
		list.add("h");
		list.add("i");
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			String letter = list.get(i);
			list.set(i, letter.toUpperCase());
		}
		System.out.println(list);
		System.out.println(list.indexOf("F"));
		System.out.println(list.subList(1, 3));
		list.subList(1, 3).clear();
		System.out.println(list);
	}

}
