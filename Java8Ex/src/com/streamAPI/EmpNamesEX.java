package com.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class EmpNamesEX {

	public static void main(String[] args) {
		List<String> enames = new ArrayList<>();
		enames.add("Rahul");
		enames.add("Sonia");
		enames.add("Rajni");
		enames.add("Nayana");
		enames.add("Samantha");
		enames.add("Kajal");
		enames.add("Priynka");
		enames.add("Modi");
		
		enames.stream().map
		//configure stream
		/*long noEmp = enames.stream().filter(name-> name.startsWith("S"))
		               .count();
		System.out.println(noEmp);
		*/
	}

}
