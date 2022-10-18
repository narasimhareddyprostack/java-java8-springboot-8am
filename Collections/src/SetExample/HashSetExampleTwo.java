package SetExample;

import java.util.HashSet;

public class HashSetExampleTwo {

	public static void main(String[] args) {
		HashSet hs1 = new HashSet();
		HashSet hs2 = new HashSet();
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		hs1.add(40);
		
		hs2.add(30);
		hs2.add(40);
		hs2.add(50);
		//union
		//hs1.addAll(hs2);
		
		//intersection
		//hs1.retainAll(hs2);
		
		hs2.removeAll(hs1);
		System.out.println(hs2);

	}

}
