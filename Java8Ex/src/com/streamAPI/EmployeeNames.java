package com.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeNames {

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
		
		/* enames.stream().sorted()
		               .forEach(name->System.out.println(name)); */
		List<String> new_Emps =enames.stream().sorted()
		               .map(name -> name.toUpperCase())
		               .filter(name->name.startsWith("R"))
		               .collect(Collectors.toList());
		System.out.println(new_Emps);
	}

}
