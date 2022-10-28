package com.PredefinedFI;

interface FunctionalInterfaceOne{
	public abstract int square(int n);
}
public class TestTwo {
	
	public static void main(String[] args) {
	FunctionalInterfaceEx ref = n -> n*n;
	int result = ref.square(10);
	System.out.println(result);
	}	
}
