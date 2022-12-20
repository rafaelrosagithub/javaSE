package br.com.xyz.jdbc;

public class Account {

	int num;
	String client;
	double balance;

	public Account(int num, String client, double balance) {
		this.num = num;
		this.client = client;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return num + "," + client + "," + balance;
	}
}
