package lambdaEx;

interface Test{
	 void methodOne();
}

public class TestImpl {
	
	public static void main(String[] args) {
	
	Test t = ()->System.out.println("Interface Method -method One");
	t.methodOne();
	}

	

}
