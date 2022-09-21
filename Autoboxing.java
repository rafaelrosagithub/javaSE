public class Autoboxing {
	
	public static void main(String[] args) {
		System.out.println("Autoboxing");
		
		Integer x = new Integer(555); // Boxing
		int a = x.intValue(); // Unboxing 
		a++; 
		x = new Integer(a); // Boxing
		System.out.println(x.intValue());
		
		// From Java version 5
		Integer y = 555;
		y++;
		System.out.println(x);
	}
}