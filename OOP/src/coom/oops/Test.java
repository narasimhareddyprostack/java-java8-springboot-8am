package coom.oops;
class Parent{
	public void m1() {
		System.out.println("Parent Class - m1 Method");
	}
}
class Child extends Parent{
	public void m2() {
		System.out.println("Child class - m2 method");
	}
}
public class Test {
public static void main(String[] args) {
	//Parent p1 = new Parent();
	//p1.m1();
	//Child c1= new Child();
	//c1.m1();
	//c1.m2();
	//Child c2=new Parent();//child cant hold parent obj
	Parent p2=new Child();
	p2.m1();

}
}
