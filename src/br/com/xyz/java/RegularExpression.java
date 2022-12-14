package br.com.xyz.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		b = "Java".matches("(?im)java");
		// System.out.println(b);

		// Metacharacters
		// . Any character
		// \d Digits [0-9]
		// \D It's not digit [^0-9]
		// \s Spaces [ \t\n\x0B\f\r]
		// \S It's not space [^\s]
		// \w Letter [a-zA-Z_0-9]
		// \W It's not lyrics

		b = "@".matches(".");
		b = "2".matches("\\d");
		b = "a".matches("\\d");
		b = "a".matches("\\w");
		b = "#".matches("\\w");
		b = " ".matches("\\s");
		b = "R".matches("\\s");
		b = "Pi".matches("..");
		b = "Pie".matches("...");
		b = "77".matches("\\d\\d");

		String zipCode = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		b = "59987-345".matches(zipCode);
		// System.out.println(b);

		// Quantifiers
		// X{n} X, Exactly n times
		// X{n,} X, at least n times
		// X{n, m} X, At least n but not more than m times
		// X? X, 0 or 1 time
		// X* X, 0 or + times
		// X+ X, 1 or + times

		b = "99".matches("\\d{2}");
		b = "123".matches("\\d{2,}");
		b = "12345".matches("\\d{2,5}");
		b = "".matches(".?"); // 0 or 1
		b = "a".matches(".?");
		b = "ab".matches(".?");
		b = "ab".matches(".*"); // 0 or +
		b = "abc".matches(".*");
		b = "".matches(".+"); // 1 or +
		b = "a".matches(".+");
		b = "ab".matches(".+");

		b = "59987-345".matches("\\d{5}-\\d{3}");
		b = "19/10/1997".matches("\\d{2}/\\d{2}/\\d{4}");
		// System.out.println(b);

		// Border metacharacter
		// ^ Start
		// $ ends
		// | or

		b = "Route53".matches("^Route.*");
		b = "Route53".matches(".*53$");
		b = "There is a Route53 here".matches(".*Route.*");
		b = "There is a Route53 here".matches("^There.*here$");
		b = "yes".matches("yes|no");
		// System.out.println(b);

		// Groupers
		// [...] Grouping
		// [a-z] Reach
		// [a-e][i-u] Union
		// [a-z&&[aeiou]] Intersection
		// [^abc] Exception
		// [a-z&&[^m-p]] Subtraction
		// \x Literal escape

		b = "x".matches("[a-z]"); // true
		b = "2".matches("[a-z]"); // false
		b = "A".matches("[a-z]"); // false
		b = "3".matches("[0-9]"); // true
		b = "true".matches("[tT]rue"); // true
		b = "True".matches("[tT]rue"); // true
		b = "True".matches("[tT]rue|[yY]es"); // true
		b = "yes".matches("[tT]rue|[yY]es"); // true
		b = "Jhon".matches("[A-Z][a-zA-Z]*"); // true
		b = "olho".matches("[^abc]lho"); // true
		b = "alho".matches("[^abc]lho"); // false
		b = "krau".matches("kr[ae]u"); // true
		b = "kreu".matches("kr[ae]u"); // true
		// System.out.println(b);

		// Email validation
		b = "rafael@xyz.com".matches("\\w+@\\w+\\.\\w{2,3}"); // true
		// System.out.println(b);

		String doce = "Qual ?? o Doce mais doCe que o doce?";
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		while (matcher.find()) {
			// System.out.println(matcher.group());
		}

		// Substitutions
		String r = doce.replaceAll("(?i)doce", "DOCINHO");
		// System.out.println(r);

		String rato = "O rato roeu a roupa do rei de roma";
		r = rato.replaceAll("r[aeiou]", "XX");
		r = "Replace spaces with tabs".replaceAll("\\s", "\t");

		String url = "www.xyz.com.br/customers-2022.html";
		// Objective
		// http://www.xti.com.br/2011/clintes.jsp

		String re = "www.xyz.com.br/\\w{2,}-\\d{4}.html";
		b = url.matches(re);

		re = "(www.xyz.com.br)/(\\w{2,})-(\\d{4}).html";

		r = url.replaceAll(re, "https://$1/$3/$2.java");

		System.out.println(url);
		System.out.println(r);
	}

}
