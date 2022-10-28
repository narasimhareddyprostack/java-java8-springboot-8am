package com.fi;

interface Test{
	void methodOne();
}

public class TestImpl2 {
	public static void main(String[] args) {
		Test t = ()->System.out.println("Method one  from - class");
		t.methodOne();
	}
}
