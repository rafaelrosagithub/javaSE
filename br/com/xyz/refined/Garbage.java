package br.com.xyz.refined;

import java.util.ArrayList;
import java.util.List;

public class Garbage {

	public static long loadMemory() {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100_000; i++) {
			list.add(i);
		}
		return Runtime.getRuntime().freeMemory();
	}

	public static void main(String[] args) {
		System.out.println("Garbage Collector");

		Runtime rt = Runtime.getRuntime();
		int MB = 1_048_576; // Total bytes in 1MB
		double total = rt.maxMemory() / MB;
		double start = total - (loadMemory() / MB);

		System.out.println("Free Memory MB: " + (loadMemory() / MB));
		System.out.println("Total MB: " + total);
		System.out.println("Start MB: " + start);

		rt.runFinalization();
		rt.gc();
		
		double end = total - (rt.freeMemory() / MB);
		System.out.println("Start: " + start + " End: " + end);
	}
}
