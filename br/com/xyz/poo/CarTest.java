package br.com.xyz.poo;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("Builders");

		Car ferrari = new Car();
		ferrari.model = "Ferrari Enzo";
		ferrari.maximumSpeed = 350;
		ferrari.secondsZeroToHundred = 3.5;

		System.out.println(ferrari.model);

		Car kombi = new Car("Kombi 1.4", 420, 3.2);

		System.out.println(kombi.model);
	}
}
