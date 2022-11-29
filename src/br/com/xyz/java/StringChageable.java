package br.com.xyz.java;

public class StringChageable {

	public static void main(String[] args) {
		System.out.println("String Changeable");

		StringBuilder s1 = new StringBuilder(); // Is not synchronized.

		StringBuffer s2 = new StringBuffer("Java"); // Synchronized methods, multiprocessor enviromment

		System.out.println(s2.toString());
		System.out.println(s2.length());
		System.out.println(s2.capacity());
		System.out.println(s2.reverse());

		StringBuffer s3 = new StringBuffer("JavaScript");
		System.out.println(s3);
		s3.append(" and " + s2.reverse());
		System.out.println(s3.toString());
		char[] a = { 'a', 'n', 'd' };
		s3.append(" ").append(a).append(" GoLang");
		System.out.println(s3.toString());
		
		String url = new StringBuilder("www.xyz.com.br").delete(0, 4).toString();
		System.out.println(url);
		
	}

}
