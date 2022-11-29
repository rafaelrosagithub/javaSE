package br.com.xyz.threads;

public class PingPongRunnable implements Runnable {

	String word;
	long time;

	public PingPongRunnable(String word, long time) {
		this.word = word;
		this.time = time;
	}

	public void run() {
		System.out.println("run()");
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(word);
				Thread.sleep(time);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			return;
		}
	}

	public static void main(String[] args) {
		System.out.println("Runnable");

		Runnable ping = new PingPongRunnable("Ping", 1000);
		Runnable pong = new PingPongRunnable("Pong", 2000);

		new Thread(ping, "ping").start();
		new Thread(pong, "pong").start();
		
		System.out.println("Threads...");
	}

}
