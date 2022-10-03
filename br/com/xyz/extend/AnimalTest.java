package br.com.xyz.extend;

public class AnimalTest {

	public static void main(String[] args) {
		System.out.println("AnimalTest class");

		Dog scoobyDoo = new Dog();
		scoobyDoo.food = "meat";
		scoobyDoo.toSleep();

		Chiken caress = new Chiken();
		caress.food = "corn";
		caress.toSleep();
	}
}
