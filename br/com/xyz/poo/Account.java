package br.com.xyz.poo;

public class Account {

	private String client;
	private double balance;

	public Account() {
	};

	public Account(String client, double balance) {
		this.client = client;
		this.balance = balance;
	}

	public String getClient() {
		return client;
	}

	public double getBalance() {
		return balance;
	}

	public void displaysBalance() {
		System.out.println(client + " your balance is: " + balance);
	}

	public void withdraw(double value) {
		balance = balance - value;
	}

	public void deposit(double value) {
		balance = balance + value;
	}

	public void transferTo(Account destiny, double value) {
		this.withdraw(value);
		destiny.deposit(value);
	}

}
