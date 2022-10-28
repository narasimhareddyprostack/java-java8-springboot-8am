package com.interfaceUpgradeStatic;

interface ConnectInterface {
	public static void m1() {
		System.out.println("ConnectInterface - m1 method - static");
	}
}

public class Connect implements ConnectInterface{
	public static void main(String[] args) {
		//ConnectInterface.m1();
		Connect c = new Connect();
		c.m1();
	}
}