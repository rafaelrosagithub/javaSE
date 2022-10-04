package br.com.xyz.poo;

public class OperationTest {

	public static void calculate(MathOperation o, double x, double y) {
		System.out.println(o.calculate(x, y));
	}

	public static void calculateWithoutPolymorphismo(String o, double x, double y) {
		System.out.println("calculateWithoutPolymorphismo()");
		if (o.equals("Sum")) {
			System.out.println(x + y);
		} else if (o.equals("Multiplication")) {
			System.out.println(x * y);
		}

	}

	public static void main(String[] args) {
		calculate(new Sum(), 2, 3);
		calculate(new Multiplication(), 2, 3);

		MathOperation s = new Sum();
		System.out.println(s.calculate(5, 5));

		MathOperation m = new Multiplication();
		System.out.println(m.calculate(5, 5));

		calculateWithoutPolymorphismo("Sum", 7, 7);
		calculateWithoutPolymorphismo("Multiplication", 7, 7);
	}
}
