package br.com.xyz.extend;

public class Cube implements CalculableVolume, CalculableArea {

	double side;

	public Cube(double side) {
		this.side = side;
	}

	@Override
	public double calculateVolume() {
		System.out.println("Cube calculateVolume()");
		return 6 * side * side;
	}

	@Override
	public double calculateArea() {
		System.out.println("Cube calculateArea()");
		return side * side * side;
	}

}
