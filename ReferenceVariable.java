public class ReferenceVariable {
	public static void main(String[] args) {
		System.out.println("Reference Variable and Garbage Collector");
		
		// Garbage collector does not act on primitive variables
		int x = 7;
		x = 9;
		
		// Garbage collector only acts on reference variables
		String y = "ZYZ";
		
		y = null; // Lose the reference
	}

}