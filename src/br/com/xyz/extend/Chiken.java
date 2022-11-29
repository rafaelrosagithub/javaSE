package br.com.xyz.extend;

public class Chiken extends Animal {

	public Chiken() {
		super(30, "Corn");
	}

	@Override
	void makeNoise() {
		System.out.println("Có, Có !!!");
	}
}
