public class RepeatFlowBreakContinueLabels {
	
	public static void main(String[] args) {
		System.out.println("Break, continue and labels repeat flow");
		
		one: // Labels
		for (int x = 0; x < 1; x++) {
			System.out.println("********** A **********");
			two: // Labels
			for (int i = 0; i < 10; i++) {
				System.out.println("********** B **********");
				if (i == 5) {
					break one;
				}	
				System.out.println(i);
			}
		}	
		
		boolean[][] matrix = {
			{false, true, false, false, false},
			{false, false, false, false, false}
		};
		
		one: // Labels
		for (int a = 0; a < matrix.length; a++) {
			System.out.print("A ");
			for (int b = 0; b < matrix[a].length; b++) {
				if (matrix[a][b]) {
					System.out.print("TRUE ");
					continue one; 
				}	
				System.out.print("B ");
			}	
		}	
	}
}