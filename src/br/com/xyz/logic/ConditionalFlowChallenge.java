package br.com.xyz.logic;
import java.util.Scanner;
import java.util.Random;

public class ConditionalFlowChallenge {
	
	public static void main(String[] args) {
		System.out.println("Conditional Flow Challenge");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("What is your hint?");
		int hint = s.nextInt();
		System.out.println("You chose the number: " + hint);
		
		Random n = new Random();
		int data = n.nextInt(6) + 1;
		System.out.println("Data: " + hint);		
		if (hint == data) {
			System.out.println("Got it right!");
		} else {
			System.out.println("Wrong!");
		}	
		
	}	
}