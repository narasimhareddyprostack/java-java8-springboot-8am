package fiEx;

interface FunctionalInterfaceOne{
	public abstract int square(int n);
}

public class FunctionalExWithLambda {
	
	public static void main(String[] args) {
		FunctionalInterfaceOne  fone = (n)->n*n;
		System.out.println(fone.square(5));
		System.out.println(fone);

	}

}
