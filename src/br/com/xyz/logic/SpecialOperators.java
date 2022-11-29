package br.com.xyz.logic;
import java.util.Scanner;

public class SpecialOperators {
	// Bit operators (BITWISE)
	// &	|	^	  ~		<<=
	// &=	|=	^|	  >>=	>>>=
	
	// Special operators
	// ?:		Ternary operators
	// ,		Separation of expressions
	// ()		Method call
	// (cast)	Unary coercion
	
	public static void main(String[] args) {
		System.out.println("Special Operators");
		
		int age = 18;
		String x = (age >= 18 ) ? "of age" : "minor";
		System.out.println(x);
		
		String sex = "M", country = "Brazil";
		System.out.println("Sex: " + sex + "\nCountry: " + country);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Report the radius");
		double radius = s.nextDouble();
		
		// Diameter = 2r  
		// double radius = 10;
		double diameter = 2 * radius;
		System.out.println("Diameter: " + diameter);
		
		// Circumference = 2 * PI * r
		double pi = Math.PI;
		double circumference = 2 * pi * radius;
		System.out.println("Circumference: " + circumference);
		
		// Area = PI * r2
		double area = pi * (radius * radius);
		System.out.println("Area: " + area);
		
	}	
	
}	