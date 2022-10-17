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
		
		// Metacharacters
		// .  Any character	   
		// \d Digits		   [0-9]
		// \D It's not digit   [^0-9]
		// \s Spaces           [ \t\n\x0B\f\r]
		// \S It's not space   [^\s]
		// \w Letter           [a-zA-Z_0-9]
		// \W It's not lyrics
		
		b = "@".matches(".");
		System.out.println(b);
		b = "2".matches("\\d");
		System.out.println(b);
		b = "a".matches("\\d");
		System.out.println(b);
		b = "a".matches("\\w");
		System.out.println(b);
		b = "#".matches("\\w");
		System.out.println(b);
		b = " ".matches("\\s");
		System.out.println(b);
		b = "R".matches("\\s");
		System.out.println(b);
		b = "Pi".matches("..");
		System.out.println(b);
		b = "Pie".matches("...");
		System.out.println(b);
		b = "77".matches("\\d\\d");
		System.out.println(b);
		
		String zipCode = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		b = "59987-345".matches(zipCode);
		System.out.println(b);
		
		
		
	}

}
