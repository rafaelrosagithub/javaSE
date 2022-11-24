package br.com.xyz.threads;

public class TestBridge {

	public static void main(String[] args) {
		System.out.println("TestBridge");

		Bridge bridge = new BridgeSynchronized();
		new Thread(new Producer(bridge)).start();
		new Thread(new Consumer(bridge)).start();
	}
}
