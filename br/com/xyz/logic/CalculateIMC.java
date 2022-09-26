package br.com.xyz.logic;
import javax.swing.JOptionPane;

	/**
	 * Calculate IMC
	 * IMC = wightInKilograms / (heightInMeters * heightInMeters)
	 * < 20  : Underweight
	 * 20-25 : Ideal Weight
	 * 25-30 : Overweight
	 * 30-35 : Moderate Obesity
	 * 35-40 : Severe Obesity
	 * 40-50 : Morbid Obesity
	 * > 50  : Super Obesity
	 */

public class CalculateIMC {
	
	public static void main(String[] args) {
		System.out.println("Calculate body mass index");
		 
		String weight = JOptionPane.showInputDialog("What is your weight in kilograms?");
		String height = JOptionPane.showInputDialog("What is your height in meters?");
		
		double wightInKilograms = Double.parseDouble(weight);
		double heightInMeters = Double.parseDouble(height);
		double imc = wightInKilograms / (heightInMeters * heightInMeters);
		
		System.out.println("IMC: " + imc);
		
		String msg = (imc >= 20 && imc <= 25) ? "Ideal Weight" : "Overweight";
		msg = "IMC = " + imc + "\n" + msg;
		
		JOptionPane.showMessageDialog(null, msg);
		System.out.println(msg);
	}	
}
	