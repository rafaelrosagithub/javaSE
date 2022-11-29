package br.com.xyz.poo;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("Builders");

		Car ferrari = new Car();
		ferrari.model = "Ferrari Enzo";
		ferrari.maximumSpeed = 350;
		ferrari.secondsZeroToHundred = 3.5;
		Engine v12 = new Engine();
		v12.type = "V12";
		v12.potency = 700;
		ferrari.engine = v12; // Add the engine to the car

		System.out.println(ferrari.model);

		Car kombi = new Car("Kombi 1.4", 420, 3.2);
		Engine v6 = new Engine("V6", 750);
		kombi.engine = v6;

		Car beetle = new Car("Beetle", 450, 2.5, new Engine("W8", 440));

		System.out.println(kombi.model);
		System.out.println(kombi.engine.type);
		System.out.println(kombi.engine.potency);

		System.out.println(beetle.model);
		System.out.println(beetle.engine.potency);
	}
}
