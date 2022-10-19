package com.streamAPI;

import java.util.ArrayList;

public class StreamExone {

	public static void main(String[] args) {
		//Stream<Integer> stream = Stream.of(10,20,30,40,50);
		//stream.forEach(num -> System.out.println(num));
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(21);
		list.add(30);
		list.add(41);
		list.add(50);
		list.add(61);
		
		//list.stream().forEach(num -> System.out.println(num));
		//list.stream().filter(num -> num %2 != 0)
		//             .forEach(num -> System.out.println(num));
		list.stream().filter(num -> num %2 !=0)
		             .forEach(System.out::println);
	}

}
