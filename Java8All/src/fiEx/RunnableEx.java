package fiEx;

public class RunnableEx {

	public static void main(String[] args) {
		String name = "Rahul Gandhi";
		Runnable r1 = ()->{System.out.println(name.toUpperCase());};
		r1.run();

	}

}
