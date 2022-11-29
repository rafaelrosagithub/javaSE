package br.com.xyz.java;

public class StringToken {

	public static void main(String[] args) {
		System.out.println("String Token");

		String s1 = "HTML; CSS; JavaScript; VueJs; Java; SpringBoot";

		String[] tokens = s1.split(";");
		System.out.println(tokens.length + " Tokens");
		for (String token : tokens) {
			System.out.println(token);
		}
	}

}
