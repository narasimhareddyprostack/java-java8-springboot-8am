package ListExample;

import java.util.LinkedList;

public class LinkedListEx3 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(10);
		ll.add(10);
		ll.add(10);
		ll.add(10);
		ll.add("A");
		ll.add(true);
		System.out.println(ll);
		System.out.println("**** Iterating using indexing");
		for(int i =0; i<=ll.size()-1; i++) {
				System.out.println(ll.get(i));
		}

	}

}
