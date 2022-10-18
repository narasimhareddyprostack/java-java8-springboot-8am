package ListExample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		//create Linked List Object
		List ll1 = new LinkedList();
		LinkedList ll2 = new LinkedList();//allowed all data types
		LinkedList<String> ll3 =new LinkedList<String>();
		
		ll2.add(10);
		ll2.add(20);
		ll2.add(30);
		System.out.println(ll2);
		ll2.addFirst(5);
		System.out.println(ll2);
		
	}

}
