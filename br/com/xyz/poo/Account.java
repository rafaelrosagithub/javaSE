package br.com.xyz.poo;

public class Account {

	String client;
	double balance;

	void displaysBalance() {
		System.out.println(client + " your balance is: " + balance);
	}

	void withdraw(double value) {
		balance = balance - value;
	}
	
	void deposit(double value) {
		balance = balance + value;
	}
	
	void transferTo(Account destiny, double value) {
		this.withdraw(value);
		destiny.deposit(value);
	}

}
