package com.fi;

interface TestInterface{
	public abstract int sum(int x, int y);
}

public class TestImpl3 implements TestInterface {
	public int sum(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		TestImpl3 t = new TestImpl3();
		System.out.println(t.sum(10, 20));
	}
}
