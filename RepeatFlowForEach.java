import java.util.ArrayList;

public class RepeatFlowForEach {
	
	public static void main(String[] args) {
		System.out.println("Repeat flow foreach");
		
		int[] pairs = {2, 4, 6, 8};
		
		// Is traditional
		System.out.println("For traditional");
		for(int i = 0; i < pairs.length; i++) {
			int pair = pairs[i];
			System.out.print(pair + ", ");
		}
		System.out.println();
		 
		// foreach
		System.out.println("Foreach");
		for(int pair : pairs) {
			System.out.print(pair+ ", ");
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}	
		
		System.out.println();
		for(Integer number : list) {
			System.out.print(number + ", ");
		}	
	
	}	
}	