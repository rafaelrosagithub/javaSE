package br.com.xyz.poo;

public class AccountTest {

	public static void main(String[] args) {
		System.out.println("Methods wtith parameters");

		Account c = new Account();
		c.client = "John";
		c.balance = 10000.00;
		c.displaysBalance();

		Account d = new Account();
		d.client = "Mary";
		d.balance = 8_000.00;
		d.displaysBalance();

		c.transferTo(d, 1550.00);

		c.displaysBalance();
		d.displaysBalance();
	}

}
