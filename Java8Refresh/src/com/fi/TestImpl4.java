package com.fi;

interface TestInOne{
	public abstract int sum(int x, int y);
}


public class TestImpl4 {

	public static void main(String[] args) {
		TestInOne t = (a,b)-> a+b;
		int result = t.sum(10, 20);
		System.out.println(result);
	}

}
