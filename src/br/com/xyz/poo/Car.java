package br.com.xyz.poo;

public class Car {

	String model;
	int maximumSpeed;
	double secondsZeroToHundred;
	Engine engine;

	public Car() {
	}

	public Car(String model, int maximumSpeed, double secondsZeroToHundred) {
		this(model, maximumSpeed, secondsZeroToHundred, null);
	}

	public Car(String model, int maximumSpeed, double secondsZeroToHundred, Engine engine) {
		this.model = model;
		this.maximumSpeed = maximumSpeed;
		this.secondsZeroToHundred = secondsZeroToHundred;
		this.engine = engine;
	}

}
