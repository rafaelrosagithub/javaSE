package br.com.xyz.poo;

public class MathematicsTest {

	public static void main(String[] args) {
		System.out.println("Methods with return");

		Mathematics m = new Mathematics();
		int result = m.larger(10, 20);
		System.out.println(result);

		double sum = m.sum(10, 20);
		System.out.println(sum);

		int odd = m.larger(2, 4);
		int even = m.larger(3, 5);

		double resultSum = m.sum(odd, even);
		System.out.println(resultSum);

		int number = 300;
		int resultRoot = m.root(number);
		System.out.println("The square root of " + number + ": " + resultRoot);

		System.out.println("Using class Math: " + Math.sqrt(number));

		System.out.println(m.sum(2, 2, 2, 2, 2));
		System.out.println(m.sum1("Title", 2, 2, 2, 2, 2));

		double[] numbers = { 2, 5, 5, 5 };
		System.out.println(m.sum2(numbers));

		// Overloaded methods
		System.out.println(m.average(5));
		System.out.println(m.average(5, 3));
		System.out.println(m.average(2, 10, 20, 10, 8));
		System.out.println(m.average("5", "3"));

	}

}
