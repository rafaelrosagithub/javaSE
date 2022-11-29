package br.com.xyz.extend;

// If a class has the final modifier, it cannot be extended
// Exemplo
//public final class Dog extends Animal {
//
//	public Dog() {
//		super(25, "Meat");
//		super.serial = 852423452;
//	}
//
//	@Override
//	void makeNoise() {
//		System.out.println("Au, Au !!!");
//	}
//
//}

public class Dog extends Animal {

	public Dog() {
		super(25, "Meat");
		super.serial = 852423452;
	}

	@Override
	void makeNoise() {
		System.out.println("Au, Au !!!");
	}

}
