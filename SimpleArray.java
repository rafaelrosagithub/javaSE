import java.util.Arrays;

public class SimpleArray {
	public static void main(String[] args) {
		System.out.println("Simple Array");
		
		String[] countries = {"Brazil", "Russia", "India", "China"};
		
		System.out.println(countries[0]);
		
		countries[0] = "BRAZIL";
		System.out.println(countries[0]);
		
		int[] odd = new int[4];
		odd[0] = 1;
		odd[1] = 5;
		odd[2] = 7;
		odd[3] = 17;
		
		System.out.println(odd[2]);
		System.out.println(odd.length);
		
		System.out.println(Arrays.toString(countries));
		
		int position = Arrays.binarySearch(countries, "BRAZIL");
		System.out.println(position);
		
		Arrays.sort(countries, 0, countries.length);
		System.out.println(Arrays.toString(countries));
		
		Double[] values = {10.15, 4466.5544};
		System.out.println(values[0].doubleValue());
		
 	}
}	
