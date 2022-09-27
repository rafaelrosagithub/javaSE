package br.com.xyz.poo;

public class Mathematics {

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

}
