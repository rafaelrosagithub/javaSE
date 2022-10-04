package br.com.xyz.extend;

public class Dog extends Animal {

	public Dog() {
		super(25, "Meat");
		super.serial = 852423452;
	}
	
	void makeNoise() {
		System.out.println("Au, Au !!!");
	}

}
