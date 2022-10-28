package com.InterfaceUpgrade;

public interface Connect {
	//whether we declared or not all interface method by default public and abstact
	
	void m1();
	void m2();
	//New Req is: upgrade the interface functionality
	default void m3() {
		System.out.println("Connect Interface - default method m3");
	}
	
}
