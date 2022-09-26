package br.com.xyz.logic;
import java.util.ArrayList;

public class ListArray {
	
	public static void main(String[] main) {
		System.out.println("Array List");
		
		ArrayList<String> colors = new ArrayList<>();
		colors.add("White");
		colors.add(0, "Yellow");
		colors.add("Green");
		colors.add("Blue");
		
		System.out.println("Colors: " + colors.toString());
		System.out.println("Size: " + colors.size());
		System.out.println("Get element index 2: " + colors.get(2));
		System.out.println("Index Green: " + colors.indexOf("Green"));
		
		colors.remove("White");
		System.out.println("Contain White? " + colors.contains("White"));
		System.out.println("Colors: " + colors.toString());
	}	
}	