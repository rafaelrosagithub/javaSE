package br.com.xyz.threads;

public class BridgeSynchronized implements Bridge {

	private int value = -1;
	private boolean busy = false;

	@Override
	public synchronized void set(int value) throws InterruptedException {
		while (busy) {
			System.out.println("Full Bridge, Producer must wait...");
			wait();
		}
		System.out.print("Produced: " + value);
		this.value = value;
		busy = true;
		notifyAll();
	}

	@Override
	public synchronized int get() throws InterruptedException {
		while (!busy) {
			System.out.println("Empty Bridge, Consumer must wait...");
			wait();
		}
		System.err.print("Consumed: " + value);
		busy = false;
		notifyAll();
		return value;
	}

}
