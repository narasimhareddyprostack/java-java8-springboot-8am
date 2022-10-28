package com.InterfaceUpgrade;

public class A implements Connect {

	@Override
	public void m1() {
		System.out.println("Class A - m1 method");

	}

	@Override
	public void m2() {
		System.out.println("Class A - m2 method");

	}

	public static void main(String[] args) {
	A a  = new A();
	a.m1();
	a.m2();

	}

}
