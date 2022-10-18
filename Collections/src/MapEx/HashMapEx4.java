package MapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx4 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		
		hm.put(101,"Rahul");
		hm.put(102,"Sonia");
		hm.put(103,"Priyanka");
		hm.put(null, "Modi");
		hm.put(null, "Modi Ji");
		System.out.println(hm.entrySet());
		
		Set s = hm.entrySet();
		/*for(Object obj: s) {
			System.out.println(obj);
		}*/
		Iterator i = s.iterator();
		while(i.hasNext()) {
			Map.Entry entry =(Entry) i.next();
			System.out.println("Employee Id:"+entry.getKey()+",Employee Name:"+entry.getValue());
		}
	}

}
