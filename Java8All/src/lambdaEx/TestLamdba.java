package lambdaEx;

@FunctionalInterface
interface TestInterface{
	public abstract int sum(int a, int b);
	//public abstract int multi(int a,int b);
}
public class TestLamdba {
	public static void main(String[] args) {
	TestInterface t = (a,b)-> a*b;
	System.out.println(t.sum(10, 20));
	int[] size = {10,20,30};
	System.out.println(size);
	}
}
