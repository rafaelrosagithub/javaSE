package br.com.xyz.threads;

public class Shopping implements Runnable {

	JointAccount account = new JointAccount();

	@Override
	public void run() {
		String client = Thread.currentThread().getName();
		for (int i = 0; i < 5; i++) {
			account.toWithdraw(20, client);
			if (account.getBalance() < 0) {
				System.out.println("Burst!!!");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Shopping Classs");

		Shopping goingShopping = new Shopping();
		new Thread(goingShopping, "Dad").start();
		new Thread(goingShopping, "Mother").start();
		new Thread(goingShopping, "Son").start();
		new Thread(goingShopping, "Daughter").start();
	}

}
