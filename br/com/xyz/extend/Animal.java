package br.com.xyz.extend;

public class Animal {

	protected int serial;
	double weight;
	String food;

	public Animal(double weight, String food) {
		this.weight = weight;
		this.food = food;
	}

	void toSleep() {
		System.out.println("Slept...");
	}

	void makeNoise() {
		System.out.println("Make noise... Animal");
	}
}
