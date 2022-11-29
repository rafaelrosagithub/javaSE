package br.com.xyz.java;

public class StringOperations {

	public static void main(String[] args) {
		System.out.println("String Operations");

		String s1 = "Write Once";
		String s2 = s1 + " Run AnyWhere";
		System.out.println(s2);

		String s3 = new String("Java Virtual Machine");

		char[] array = { 'J', 'a', 'v', 'a' };
		String s4 = new String(array);
		System.out.println(s4);

		// Operations
		int size = s1.length();
		System.out.println(size);
		char letter = s1.charAt(0);
		System.out.println(letter);
		String text = s1.toString();
		System.out.println(text);

		// Localization
		int position = s3.indexOf("Virtual");
		System.out.println(position);
		System.out.println(s3.substring(position));
		int lastIndexof = s3.lastIndexOf("a");
		System.out.println(lastIndexof);
		boolean empty = s3.isEmpty();
		System.out.println(empty);

		// Comparation
		String xyz = "XYZ";
		System.out.println(xyz.equals("xyz")); // Compare the values
		System.out.println(xyz.equalsIgnoreCase("xyz")); // true
		System.out.println(xyz == "xyz"); // Compares two objects, if it is the same reference
		System.out.println(xyz.startsWith("xyz")); // false
		System.out.println(xyz.endsWith("YZ")); // true

		int x = "avocado".compareTo("banana");
		System.out.println(x);
		int y = "banana".compareTo("avocado");
		System.out.println(y);
		int z = "banana".compareTo("banana");
		System.out.println(z);
		int n = "123".compareTo("345");
		System.out.println(n);

		String st = "Text, text";
		System.out.println(st.regionMatches(6, "Text", 0, 4)); // false
		System.out.println(st.regionMatches(true, 6, "Text", 0, 4)); // With case sensitive, true

		// Extraction
		String l = "the lake is blue";
		String sl = l.substring(12);
		System.out.println(sl);
		System.out.println(l.substring(4, 8));

		// Modification
		System.out.println(l.concat(" and deep")); // Concanate Strings
		System.out.println(l.replace("l", "L"));
		System.out.println(l.replaceFirst(" ", "X"));
		System.out.println(l.replaceAll(" ", "-"));
		System.out.println(l.toUpperCase());
		System.out.println(l.toLowerCase());

		System.out.println("   blank spaces   ".trim()); // Remove whitespace
	}

}
