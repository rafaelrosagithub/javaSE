package br.com.xyz.logic;
public class ComparisonOperators {
	
	// Comparison Operators
	// ==			Equal
	// != 			Different
	// > 			Larger
    // <			Smaller
    // >=			Bigger or equal
    // <=			Less or equal
    // instaceof 	Compare types
	
	public static void main(String[] args) {
		System.out.println("Comparison Operators");
		
		Integer x = 7;
		System.out.println(x == 7);
		System.out.println(x != 7);
		System.out.println(x > 7);
		System.out.println(x < 7);
		System.out.println(x >= 7);
		System.out.println(x <= 7);
		System.out.println(x instanceof Integer); // Instanceof is used to compare object only
	}	
	
}