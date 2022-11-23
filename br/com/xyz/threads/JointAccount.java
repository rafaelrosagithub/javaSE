package br.com.xyz.threads;

public class JointAccount {

	private int balance = 100;

	public int getBalance() {
		return balance;
	}

	public void toWithdraw(int value, String client) {
		if (balance >= value) {
			System.out.println(client + " toWithdraw()");
			int originalBalance = balance;
			try {
				System.out.println(client + " waiting...");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= value;
			System.out.println("Original balance: " + originalBalance + ", " + client + " drew: " + value + ", Final balance: " + balance );
		} else {
			System.out.println("Insufficient account balance ");
		}
	}

}
