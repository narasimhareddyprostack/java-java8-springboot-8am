package SetExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs1  =new HashSet();//default 16, fillratio/load facter 0.75
		HashSet hs2  =new HashSet(50, (float) 0.6);
		HashSet hs3 = new HashSet(100);
		HashSet<Integer> hs4 = new HashSet<Integer>();
		System.out.println(hs1);
		//update
	    hs1.add("Rahul");
	    hs1.add("Rahul");
	    hs1.add("Sonia");
	    hs1.add("Priyanka");
	    hs1.add(null);
	    System.out.println(hs1);
	    //print HS Size
	    System.out.println(hs1.size());//4
	    
	    System.out.println(hs1.contains("Rahul")); //true
	    
	    //iterate HashSet - using for Each
	    for(Object obj:hs1) {
	    		System.out.println(obj);
	    }
	    System.out.println("Iterating using - iterator and while"); 
	    Iterator i=hs1.iterator();
	    while(i.hasNext()) {
	    	System.out.println(i.next());
	    }
	}

}
