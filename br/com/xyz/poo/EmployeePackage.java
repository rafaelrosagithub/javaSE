package br.com.xyz.poo;

public class EmployeePackage {

	public static void main(String[] args) {
		System.out.println("Employee package");

		Employee e = new Employee();

		// e.name1 = "Private modifier"; // No access
		// e.getName1(); // No access

		e.name2 = "Package modifier";
		System.out.println(e.name2);
		e.getName2();

		e.name3 = "Public modifier";
		System.out.println(e.name3);
		e.getName3();
	}

}
