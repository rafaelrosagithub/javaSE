package br.com.xyz.logic;
public class ReferenceVariable {
	public static void main(String[] args) {
		System.out.println("Reference Variable and Garbage Collector");
		
		// Garbage collector does not act on primitive variables
		int x = 7;
		x = 9;
		
		// Garbage collector only acts on reference variables
		String y = "ZYZ"; // Will lose the reference, garbage collector will act
		y = "ZYZWST"; // New reference
		
		y = null; // Lose the reference
	}

}