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

		System.out.println(scoobyDoo instanceof Dog);
		System.out.println(scoobyDoo instanceof Animal);

		System.out.println(scoobyDoo.equals(scoobyDoo));
		System.out.println(scoobyDoo.equals(caress));
		System.out.println(scoobyDoo.hashCode());
		System.out.println(scoobyDoo.getClass());
		System.out.println(caress.getClass());
		System.out.println(caress.getClass());
		System.out.println(caress.toString());
		System.out.println(scoobyDoo.toString());
	}
}
