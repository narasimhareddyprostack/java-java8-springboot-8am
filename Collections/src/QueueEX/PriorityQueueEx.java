package QueueEX;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue pq1 = new PriorityQueue();
		
		PriorityQueue pq2 = new PriorityQueue();
		pq1.add("A");
		pq1.add("B");
		pq1.offer("C");
		pq1.offer("D");
		System.out.println(pq1);
		System.out.println(pq1.element());
		System.out.println(pq1.peek());
		System.out.println("Queue one - remove operation");
		System.out.println(pq1.remove()); //A
		System.out.println(pq1.poll()); //B
		
		
		System.out.println("**** Empty Queue*****");
		//System.out.println(pq2.element());
		//System.out.println(pq2.peek());
		System.out.println("**** Empty Queue*****");
		//System.out.println(pq2.remove());
		System.out.println(pq2.poll());
	}

}
