package br.com.xyz.logic;
public class Wrappers {
	public static void main(String[] args) {
		System.out.println("Wrapper classes");
		
		/* Primitive Wrappers
		 * Integer    Byte   Short
		 * Long       Float  Double
		 * Character   Void   Boolean
		 */
		 
		 Integer age = new Integer(32);
		 System.out.println("Age: " + age);
		 
		 Double price = new Double("12.45");
		 double d = price.doubleValue();
		 int i = price.intValue();
		 byte b = price.byteValue();
		 System.out.println("d: " + d);
		 System.out.println("i: " + i);
		 System.out.println("b: " + b);
		 
		 Boolean married1 = new Boolean(true);
		 Boolean married2 = new Boolean("true");
		 Boolean married3 = new Boolean("yes");
		 
		 // Static conversion
		 double d1 = Double.parseDouble("123.45");
		 int i1 = Integer.parseInt("123");
		 float f1 = Float.parseFloat("3.15F");
		 
		 int i2 = Integer.valueOf("101011", 2);
		 System.out.println("i2: " + i2);
	}
}