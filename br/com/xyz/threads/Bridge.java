package br.com.xyz.threads;

public interface Bridge {

	public void set(int value) throws InterruptedException;

    public int get() throws InterruptedException;

}
