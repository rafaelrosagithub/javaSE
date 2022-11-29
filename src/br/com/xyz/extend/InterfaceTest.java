package br.com.xyz.extend;

public class InterfaceTest {

	public static void area(CalculableArea o) {
		System.out.println(o.calculateArea());
	}

	public static void volume(CalculableVolume o) {
		System.out.println(o.calculateVolume());
	}

	public static void main(String[] args) {
		System.out.println("Interface Test");

		area(new Square(2));
		area(new Cube(2));
		volume(new Cube(2));

		CalculableVolume cv = new Cube(10);
		System.out.println(cv.calculateVolume());
		System.out.println(cv.Z);

	}

}
