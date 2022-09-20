import java.util.ArrayList;

public class Fibonacci {
	
	public static void main(String[] args) {
		System.out.println("Fibonacci");
		
		int previous = 0;
		int next = 1;
		
		System.out.println(previous);
		
		while(next < 50) {
			System.out.println(next);
			next = previous + next;
			previous = next - previous;
		}	
	
		previous = 0;
		next = 1;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(previous);
		list.add(next);
		
		for(int i = 0; i <= 50; i++) {
			list.add(previous + next);
			next = previous + next;
			previous = next - previous;
		}	
		System.out.println(list);
	}	
}	