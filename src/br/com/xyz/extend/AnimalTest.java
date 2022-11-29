package br.com.xyz.extend;

public class AnimalTest {

	public static void noise(Animal animal) {
		System.out.println("noise()");
		animal.makeNoise();
	}

	public static void noiseWithoutPolymorphism(String animal) {
		System.out.println("noiseWithoutPolymorphism()");
		if (animal.equals("Dog")) {
			System.out.println("Au, Au !!!");
		} else if (animal.equals("Chiken")) {
			System.out.println("Có, Có !!!");
		}
	}

	public static void main(String[] args) {
		System.out.println("AnimalTest class");

		Animal scoobyDoo = new Dog();
		scoobyDoo.food = "meat";
		scoobyDoo.toSleep();
		scoobyDoo.makeNoise();

		Animal caress = new Chiken();
		caress.food = "corn";
		caress.toSleep();
		caress.makeNoise();
		
		// The animal class is an abstract class, so it cannot be instantiated
		// Animal generic = new Animal(0, null); 

		noise(scoobyDoo);
		noise(caress);

		noiseWithoutPolymorphism("Dog");
		noiseWithoutPolymorphism("Chiken");

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
