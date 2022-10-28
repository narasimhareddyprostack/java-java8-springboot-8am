package com.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employees {

	public static void main(String[] args) {
		List<String> enames = new ArrayList();
		enames.add("Rahul");
		enames.add("Kishore");
		enames.add("biplob");
		enames.add("Chi");
		enames.add("satya");
		for(String ename :enames) {
			System.out.println(ename);
		}
		List data= enames.stream()
		      .map((ename)->ename.toUpperCase())
		     
		      .collect(Collectors.toList());
		System.out.println(data);
		
	}

}
