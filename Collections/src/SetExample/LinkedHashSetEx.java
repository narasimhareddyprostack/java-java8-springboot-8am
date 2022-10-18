package SetExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		HashSet hs = new HashSet();  //default 16, fill ratio or load facter 0.75
		LinkedHashSet lhs = new LinkedHashSet();
	
		hs.add("A");
		hs.add(100);
		hs.add(true);
		hs.add(null);
		
		lhs.add("A");
		lhs.add(100);
		lhs.add(true);
		lhs.add(null);

		System.out.println(hs);
		System.out.println("_________________");
		System.out.println(lhs);
		System.out.println("Iterating");
		System.out.println("_________________");
		for(Object obj:hs) {
				System.out.println(obj);
		}
		System.out.println("_________________");
		for(Object obj:lhs) {
				System.out.println(obj);
		}
		
		System.out.println(hs.size());
		System.out.println("*********using Iterator*****");
		Iterator i =hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("*********using Iterator*****");
		Iterator i1 =lhs.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
	}

}
