package br.com.xyz.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {

	public static void main(String[] args) {
		System.out.println("Queue Collection");

		// FIFO
		Queue<String> queue = new LinkedList<>();
		queue.add("a");
		queue.add("d");
		queue.add("f");
		queue.offer("b");
		System.out.println(queue);

		System.out.println(queue.peek());
		System.out.println(queue.poll()); // Remove the next element from the queue
		System.out.println(queue);

		// Other methods available in LinkedList
		LinkedList<String> q = (LinkedList<String>) queue;
		q.addFirst("z");
		q.addLast("a");
		System.out.println(q);
		System.out.println(q.peekFirst());
		System.out.println(q.peekLast());
		q.pollFirst();
		q.pollLast();
		System.out.println(q);
	}
}
