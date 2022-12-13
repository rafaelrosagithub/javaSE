package br.com.xyz.test;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		System.out.println("Test");

		List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 5, 6, 7, 7, 8, 8, 9);
		list.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));

		list.stream().map(e -> e * 2).forEach(e -> System.out.println(e));

		list.stream().distinct().map(e -> e + 2).forEach(e -> System.out.println(e));

		list.stream().peek(n -> System.out.println("debug"))
				.map(n -> new StringBuilder().append(n).append("s").append("a")).forEach(System.out::println);
	}
}
