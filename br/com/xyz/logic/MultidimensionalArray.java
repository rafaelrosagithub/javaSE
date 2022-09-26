package br.com.xyz.logic;
import java.util.Random;

public class MultidimensionalArray {
	
	public static void main(String[] args) {
		System.out.println("Multidimensional Array");
		
		String[] one = {"Peter", "Anna"};
		
		String[][] two = {{"Peter", "M", "WS"}, {"Anna", "F", "DT"}};
			
		System.out.println(two.length);
		System.out.println(two[0].length);
		System.out.println(two[0][1]);
		
		two[1][0] = "Michel";
		System.out.println(two[1][0]);
		
		String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "LADY", "KING"};
		String[] suits = {"Swords", "Clubs", "Hearts", "Diamonds"};
		
		Random r = new Random();
		
		int indexFace = r.nextInt(faces.length);
		String face = faces[indexFace];
		
		int indexSuit = r.nextInt(suits.length);
		String suit = suits[indexSuit];
		
		String letter = face + " " + suit;
		System.out.println("Letter: " + letter);
		
	}	
}	