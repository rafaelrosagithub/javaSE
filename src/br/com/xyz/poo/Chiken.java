package br.com.xyz.poo;

public class Chiken {

	public static int farmEggs; // Global variable

	public int eggs; // Chiken object's total of eggs

	public Chiken layEgg() {
		this.eggs++;
		Chiken.farmEggs++;
		return this;
	}

	public static double averageFarmEgss(int chikens) {
		return Chiken.farmEggs / chikens;
	}

}
