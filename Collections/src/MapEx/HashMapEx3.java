package MapEx;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapEx3 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		
		hm.put(101,"Rahul");
		hm.put(102,"Sonia");
		hm.put(103,"Priyanka");
		hm.put(null, "Modi");
		hm.put(null, "Modi Ji");
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		System.out.println(hm.entrySet());
	}

}
