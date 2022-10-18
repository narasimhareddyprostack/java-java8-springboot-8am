package MapEx;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapEx {

	public static void main(String[] args) {
		//HashMap map= new HashMap(100,0.5f); //default 11, fill ratio/load factor 0.75
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		hm.put(101,"Rahul");
		hm.put(102,"Sonia");
		ht.put(101, "Rahul Gandhi");
		System.out.println(hm);
		System.out.println(ht);
	}

}
