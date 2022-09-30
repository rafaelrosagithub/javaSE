package br.com.xyz.poo;

public class Mathematics {

	/**
	 * 
	 * @param number
	 * @return The square root of a number according to pell's equation
	 */
	int root(int number) {
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
	int larger(int one, int two) {
		if (one > two) {
			return one;
		} else {
			return two;
		}
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

	// Methods with variable arguments
	double sum1(String title, double... numbers) {
		double total = 0;
		for (double n : numbers) {
			total += n;
		}
		System.out.println("Title: " + title);
		return total;
	}

	// Methods with variable arguments
	double sum2(double[] numbers) {
		double total = 0;
		for (double n : numbers) {
			total += n;
		}

		return total;
	}

}
