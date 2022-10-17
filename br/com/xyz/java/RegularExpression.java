package br.com.xyz.java;

public class RegularExpression {

	public static void main(String[] args) {
		System.out.println("Regular Expression");

		String pattern = "Java";
		String text = "Java";
		boolean b = text.matches(pattern);
		System.out.println("Contains? " + b);
		
		// Modifiers
		// (?i), Ignore uppercase and lowercase
		// (?x), Comments
		// (?m), Multiline
		// (?s), Dottal
		
		b = "Java".matches("(?i)java");
		System.out.println(b);
		b = "Java".matches("(?im)java");
		System.out.println(b);
	}

}
