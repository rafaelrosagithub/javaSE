package br.com.xyz.extend;

public abstract class Animal {

	protected int serial;
	double weight;
	String food;

	public Animal(double weight, String food) {
		this.weight = weight;
		this.food = food;
	}

	// Final modifier, this method can no longer be modified by anyone who extends this class
	final void toSleep() {
		System.out.println("Slept...");
	}

	abstract void makeNoise();
}
