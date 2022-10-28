package com.InterfaceUpgrade;

public class B implements Connect {

	@Override
	public void m1() {
		System.out.println("Class B - m1 method");

	}

	@Override
	public void m2() {
		System.out.println("Class B - m2 method");

	}

	public static void main(String[] args) {
		B  b = new B();
		b.m1();
		b.m2();
		b.m3();

	}

}
