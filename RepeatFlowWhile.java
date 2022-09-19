import java.util.ArrayList;
import java.util.Scanner;

public class RepeatFlowWhile {
	
	public static void main(String[] args) {
		System.out.println("Repeat flow while");
			
		ArrayList<String> products = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		
		System.out.println("List your products: to exit type END");
		
		String product;
		while(!"END".equals(product = s.nextLine())) {
			products.add(product);
		}
		System.out.println(products.toString());		
		
		int i = 3;
		do {
			System.out.println(i);
			i++;
		} while(i < 2);
	}
}	