package br.com.xyz.threads;

/**
 * A <code>bridge</code> represents the link between Information Producer and
 * Consumer objects. <i>Producers</i> use Bridges to record information and
 * share that information with Consumers who read that data from the Bridge for
 * processing.
 * 
 * @author Rafael Rosa
 * @version 1.4
 * @since 1.0
 * 
 * @see BridgeNotSynchronized
 * @see BridgeSynchronized
 *
 */

public interface Bridge {

	/**
	 * 
	 * @param value
	 * @throws InterruptedException
	 */
	public void set(int value) throws InterruptedException;

	/**
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public int get() throws InterruptedException;

}
