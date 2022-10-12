package br.com.xyz.error;

public class DebugExample {

	int result;

	public int root(int number) {
		int root = 0, odd = 1;
		while (number >= odd) {
			number -= odd;
			odd += 2;
			++root;
		}
		return root;
	}

	public static void main(String[] args) {
		System.out.println("Debug example");

		int number = 16;

		DebugExample ex = new DebugExample();
		int root = ex.root(number);

		if (root == 4) {
			System.out.println("Correct root!");
		}
	}

}
