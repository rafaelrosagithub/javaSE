package br.com.xyz.poo;

public class AccountTest {

	public static void main(String[] args) {
		System.out.println("Methods wtith parameters");

		Account c = new Account("John", 10000.00);
		c.displaysBalance();

		Account d = new Account("Mary", 8_000.00);
		d.displaysBalance();

		c.transferTo(d, 1550.00);

		c.displaysBalance();
		d.displaysBalance();
	}

}
