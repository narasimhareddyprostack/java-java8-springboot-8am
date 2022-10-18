package lambdaEx;

interface TestOne{
	 void methodOne();
}

public class TestImpl2 implements TestOne{
	@Override
	public void methodOne() {
		System.out.println("Interface method - method One");
		
	}
	public static void main(String[] args) {
	TestImpl2 t = new TestImpl2();
	t.methodOne();

	}

	

}
