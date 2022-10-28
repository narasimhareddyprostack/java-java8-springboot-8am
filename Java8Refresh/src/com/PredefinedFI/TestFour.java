package com.PredefinedFI;

import java.util.function.Function;

public class TestFour {
	static Function<Integer, Integer> f = (n)->n*n;
	public static void main(String[] args) {
		System.out.println(f.apply(10));

	}

}
