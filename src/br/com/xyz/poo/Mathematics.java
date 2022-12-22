package br.com.xyz.poo;

public class Mathematics {

	/**
	 * 
	 * @param number
	 * @return The square root of a number according to pell's equation
	 */
	public int root(int number) {
		int root = 0, odd = 1;
		while (number >= odd) {
			number -= odd;
			odd += 2;
			++root;
		}
		return root;
	}

	/**
	 * 
	 * @param one
	 * @param two
	 * @return The larger of the two numbers
	 */
	public int larger(int one, int two) {
		if (one > two) {
			return one;
		} else {
			return two;
		}
	}

	public double divide(int one, int two) {
		return one / two;
	}

	double sum(double one, double two) {
		return one + two;
	}

	// Methods with variable arguments
	double sum(double... numbers) {
		double total = 0;
		for (double n : numbers) {
			total += n;
		}

		return total;
	}

	double sum1(String title, double... numbers) {
		double total = 0;
		for (double n : numbers) {
			total += n;
		}
		System.out.println("Title: " + title);
		return total;
	}

	double sum2(double[] numbers) {
		double total = 0;
		for (double n : numbers) {
			total += n;
		}

		return total;
	}

	// Overloaded methods
	double average(int x) {
		System.out.print("average(int x) ");
		return x;
	}

	double average(int x, int y) {
		System.out.print("average(int x, int y) ");
		return (x + y) / 2;
	}

	double average(double... numbers) {
		System.out.print("average(double... numbers) ");
		return this.sum(numbers) / numbers.length;
	}

	double average(String x, String y) {
		System.out.print("average(String x, String y) ");
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return (ix + iy) / 2;
	}

}
