package com.fi;

@FunctionalInterface
interface TestOne {
	void methodOne();// Single Abstract Method
	
}
interface TestTwo extends TestOne{
	
}

public class TestImpl implements TestTwo {
	
	@Override
	public void methodOne() {
		System.out.println("Method one from - Class");
		
	}

	public static void main(String[] args) {
	TestImpl t = new TestImpl();
	t.methodOne();
	}

	

}
