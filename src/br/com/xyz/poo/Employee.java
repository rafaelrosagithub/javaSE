package br.com.xyz.poo;

// Access Modifiers
// private : in the class itself
// package <none> : in the same package
// protected : in subclasses
// public : anywhere

// Other modifiers
// strictfp abstract volatile
// static final synchronized
// transient native @annotations

public class Employee {

	private String name1;
	String name2; // Package modifier
	public String name3;

	private String name;
	private boolean active;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	private String getName1() {
		System.out.println("Private getName1()");
		return name3;
	}

	String getName2() {
		System.out.println("Package getName2()");
		return name2;
	}

	public String getName3() {
		System.out.println("Public getName3()");
		return name3;
	}

	public static void main(String[] args) {
		System.out.println("Employee");

		Employee e = new Employee();
		e.name1 = "Private modifier";
		System.out.println(e.name1);
		e.getName1();

		e.name2 = "Package modifier";
		System.out.println(e.name2);
		e.getName2();

		e.name3 = "Public modifier";
		System.out.println(e.name3);
		e.getName3();

		e.setName("Rafael");
		System.err.println(e.getName());
		System.err.println(e.isActive());
	}

}
