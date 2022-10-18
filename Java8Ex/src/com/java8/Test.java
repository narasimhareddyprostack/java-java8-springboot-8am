package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		//Stream<Integer> stream = Stream.of(new Integer[] {1,2,3,4,5,6});
		//stream.forEach(value->System.out.println(value));
		//stream.forEach(System.out::println);

		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=10000;i++) {
			list.add(i);
		}
		Stream<Integer> st = list.stream();
		//st.filter(value->value%2==0).forEach(x->System.out.println(x));
		st.filter(value->value%2==0).forEach(System.out :: println);

	}

}
