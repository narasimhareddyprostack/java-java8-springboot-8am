package com.PredefinedFI;


interface FunctionalInterfaceEx{
	public abstract int square(int n);
}
public class TestOne implements FunctionalInterfaceEx {

	@Override
	public int square(int n) {
		// TODO Auto-generated method stub
		return n*n;
	}
	public static void main(String[] args) {
		TestOne t=new TestOne();
		int result = t.square(10);
		System.out.println(result);
	}

	

}
