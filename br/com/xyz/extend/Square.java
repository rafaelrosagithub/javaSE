package br.com.xyz.extend;

public class Square implements CalculableArea {
	
	double side;
	public Square(double side) {
		this.side = side;
	}

	@Override
	public double calculateArea() {
		System.out.println("Square calculateArea");
		return side * side;
	}

}
