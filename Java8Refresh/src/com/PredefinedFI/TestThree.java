package com.PredefinedFI;

import java.util.function.Predicate;

public class TestThree {
	static Predicate<Integer> p = (n)-> n%2 ==0;
	
	public static void main(String[] args) {
			System.out.println(p.test(11));
			String name = "Rahul Gandhi";
			Runnable r1 = ()->{System.out.println(name);};
			r1.run();
	}
}
