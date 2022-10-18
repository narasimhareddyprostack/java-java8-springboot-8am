package lambdaEx;


interface TestInterfaceOne{
	public abstract int sum(int a, int b);
}

public class TestWithOutLambda implements TestInterfaceOne{
	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	public static void main(String[] args) {
		TestWithOutLambda  t = new TestWithOutLambda();
		System.out.println(t.sum(10, 20));
}
}