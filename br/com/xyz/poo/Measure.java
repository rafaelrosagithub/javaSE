package br.com.xyz.poo;

public enum Measure {
	
MM("Mlimeter"), CM("Centimeter"), M("Meter");
	
	public String title;
	
	private Measure(String title) {
		this.title = title;
	}
}
