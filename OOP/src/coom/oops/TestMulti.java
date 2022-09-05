package coom.oops;

class A{
	public void m1() {
		System.out.println("A - m1() method");
	}
}
class B extends A{
	public void m2() {
		System.out.println("B - m2() method");
	}
}
class C extends B{
	public void m3() {
		System.out.println("C - m3() method");
	}
}
public class TestMulti {
	public static void main(String[] args) {
		B b=new C();
		b.m1();
		b.m2();
		//b.m3();
	}
}
