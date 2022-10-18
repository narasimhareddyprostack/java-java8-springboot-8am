package fiEx;

interface FunctionalInterface{
	public abstract int square(int n);
}
public class FunctionExOne implements FunctionalInterface {
	@Override
	public int square(int n) {
		// TODO Auto-generated method stub
		return n*n;
	}
	public static void main(String[] args) {
		
		FunctionExOne fone = new FunctionExOne();
		System.out.println(fone.square(5));
		System.out.println(fone);
	}

	

}
