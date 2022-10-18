package fiEx;

import java.util.function.Predicate;

public class PredicateEx {
	static Predicate<Integer> p = (n)-> n%2 ==0; 
	public static void main(String[] args) {
	System.out.println(p.test(66));
	}
}
