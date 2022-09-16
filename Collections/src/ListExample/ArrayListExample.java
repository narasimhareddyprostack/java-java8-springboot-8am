package ListExample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//create ArrayList Object
		//1.Allowed all data types
		ArrayList al1=new ArrayList();//allocated defatly 10 memoery locatiion
		//2.String Data Types
		ArrayList<String> al2 =new ArrayList<String>();
		
		al2.add("Rahul Gandhi");
		al2.add("Sonia Gandhi");
		//al2.add(10);//int type not allowed here
		List al3 = new ArrayList();
	
		System.out.println(al1);
		
		//Add elements 
		al1.add(10);
		al1.add(20);
		al1.add("Thirty");
		al1.add(true);
		al1.add(10);
		al1.add(null);
		
		System.out.println(al1);
		System.out.println(al2);
		al1.addAll(al2);
		System.out.println("***");
		System.out.println(al1);
		
		//return array List Size
		System.out.println(al1.size());
		//check element exist or not 
		System.out.println(al1.contains("Rahul Gandhi1"));
        //is Empty or not 
		System.out.println(al1.isEmpty());
	}

}
