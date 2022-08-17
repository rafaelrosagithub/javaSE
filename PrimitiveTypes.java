/**
 * Primitive Types
 * @author Rafael
 */
public class PrimitiveTypes {
	public static void main(String[] args) {
		System.out.println("Primitive Types");
		
		int age = 33;
		double price = 11.45;
		char sex = 'M';
		boolean married = true;
		
		byte b = 127; // hundred
		short s = 32767; // 32 thousand
		int i = 2_000_000_000; // 2 billion
		long l = 9_000_000_000_000_000_000L; // 9 quintilion
		
		// IEEE 754
		double d = 1.7976931348623157E+308D;
		float f = 123F;
		
		byte bb = 0b01010101; // 8 bits == 1 byte
		short ss = 0b0101010101010101; // 16 bits == 2 bytes
		int ii = 0b01010101010101010101010101010101; // 32 bits == 4 bytes 
		
		System.out.println("ii: " + ii);
		
		i = s; // Implicit cast 
		
		System.out.println("s: " + s);
		System.out.println("i: " + i);
		
		i = (int) l; // Explicit cast
		
		System.out.println("l: " + l);
		System.out.println("i: " + i);
	}

}