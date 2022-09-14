public class FlowIfElse {
	
	public static void main(String[] args) {
		System.out.println("Flow if else");
		
		int age = 39;
		
		if (age <= 11) {
			System.out.println("Child");
		} else if (age > 11 && age <= 18) {
			System.out.println("Adolescent");
		} else if (age > 18 && age <= 60) {
			System.out.println("Adult");
		} else {
			System.out.println("Best age");
		}	
		
		int nota = 3;
		
		if (nota >= 7) {
			System.out.println("Approved");
		} else {
			System.out.println("failed");
			if (nota >= 6) {
				System.out.println("But it is still possible to do the recovery test");
			}	
		}	
	}	
}	