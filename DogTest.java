
public class DogTest {
	
	public static void main(String[] args) {
		System.out.println("Dog Test...");
		
		Dog puppy = new Dog();
		puppy.breed = "Poodle";
		puppy.size = 35;
		puppy.bark();
		
		Dog mutt = new Dog();
		mutt.breed = "Mutt";
		mutt.size = 30;
		mutt.bark();
		
		
	}

}
