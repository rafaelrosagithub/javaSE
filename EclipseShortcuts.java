import java.util.ArrayList;
import java.util.Scanner;

public class EclipseShortcuts {

	@SuppressWarnings({ "unused", "resource" })
	public EclipseShortcuts() {
		Scanner reader = new Scanner(System.in);

		System.out.println("Type anything...");
		reader.nextLine();

		int[] array = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(i);
		}

		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		for (String string : list) {
			System.out.println(string);
		}

	}

	public static void main(String[] args) {
		System.out.println("Eclipse shortcuts");

		new EclipseShortcuts();

		// Ctrl + 1 : Bug fix
		// Ctrl + space : Complete codes
		// Ctrl + shift + f : Format the code
		// Ctrl + o : Fast navigation
		// Ctrl + shift + o : Auto import
	}

}
