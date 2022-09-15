public class RepeatFlowFor {
	
	public static void main(String[] args) {
		System.out.println("Repeat flow for");
		
		String text1 = "";
		for(int i = 0; i < 10; i++) {
			text1 += i + ",";
		}
		System.out.println("Text1: " + text1);
		
		String text2 = "";
		for(int i = 10; i > 0; i--) {
			text2 += i + ",";
		}
		System.out.println("Text2: " + text2);
		
		String pairNumbers = "";
		for(int i = 0; i <= 20; i++) {
			if (i % 2 == 0){
				pairNumbers += i + ",";
			}
		}
		System.out.println("Pair numbers: " + pairNumbers);
		
		int size = 10;
		for(int i = 0; i < size; i++) {
			for(int x = 0; x < size; x++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
}