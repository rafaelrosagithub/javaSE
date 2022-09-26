package br.com.xyz.logic;
public class LogicalOperators {
	
	// && AND 
	// || OR
	// ! NOT
	
	public static void main(String[] args) {
		System.out.println("Logical Operators");
		
		int x = 7;
		System.out.println((x >= 1) && (x <= 10));
		System.out.println((x >= 1) && (x <= 5));
		System.out.println((x >= 1) || (x <= 5));
		System.out.println((x >= 1));
		System.out.println(!(x >= 1));
	}	
}	