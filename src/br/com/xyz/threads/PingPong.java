package br.com.xyz.threads;

public class PingPong extends Thread {

	String word;
	long time;

	public PingPong(String word, long time) {
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
		System.out.println("Threads");

		new PingPong("Ping", 1000).start();
		new PingPong("Pong", 3000).start();
	}

}
