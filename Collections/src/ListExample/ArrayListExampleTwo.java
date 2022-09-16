package ListExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExampleTwo {

	public static void main(String[] args) {
		ArrayList<String> enames=new ArrayList<String>();
		
		enames.add("Rahul");
		enames.add("Sonia");
		enames.add("Priyanka");
		enames.add("Rajni");
		enames.add("Nayana");
		enames.add("Sha");
		enames.add("Bhanu");
		
		//read all ArrayList elements
		for(Object ename:enames) {
			System.out.println(ename);
		}
		//read element using for loop
		for(int i=0; i<=enames.size()-1;i++) {
			System.out.println(enames.get(i));
		}
		System.out.println("****using iteraror****");
		//read all elements using iterator();
		Iterator i =enames.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());//print and go to next 
		}
	}

}
