package br.com.xyz.poo;

public class ChikenTest {

	public static void main(String[] args) {
		System.out.println("Class ChikenTest");

		Chiken c1 = new Chiken();
		c1.layEgg().layEgg().layEgg();

		Chiken c2 = new Chiken();
		c2.layEgg().layEgg();

		System.out.println("Chiken 1: " + c1.eggs);
		System.out.println("Chiken 2: " + c2.eggs);
		System.out.println("FarmEggs: " + Chiken.farmEggs);
		System.out.println("Average farm eggs: " + Chiken.averageFarmEgss(2));
	}

}
