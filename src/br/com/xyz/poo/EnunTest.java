package br.com.xyz.poo;

public class EnunTest {

	public static final double PI = 3.14;

	public static void toWalk(Measure m, int total) {
		if ("M" == Measure.M.toString()) {
			System.out.println("Meters");
		}

	}

	public static void main(String[] args) {
		System.out.println("ENUM Test");

		System.out.println(PI);
		System.out.println(ChessPieces.BISHOP);
		System.out.println(Measure.MM.title);

		for (Measure m : Measure.values()) {
			System.out.println(m + ": " + m.title);
		}

		toWalk(Measure.M, 100);
	}

}
