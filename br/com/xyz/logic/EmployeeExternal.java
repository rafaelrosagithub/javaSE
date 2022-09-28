package br.com.xyz.logic;

import br.com.xyz.poo.Employee;

public class EmployeeExternal {

	public static void main(String[] args) {
		System.out.println("Employee external");

		Employee e = new Employee();

		// e.name1 = "Private modifier"; // No access
		// e.getName1(); // No access

		// e.name2 = "Package modifier"; // No access
		// e.getName2(); // No access

		e.name3 = "Public modifier";
		System.out.println(e.name3);
		e.getName3();
	}

}
