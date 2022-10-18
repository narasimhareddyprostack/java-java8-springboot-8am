package ListExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayListEx {
	public static void main(String[] args) {
		String[] names = {"Rahul","Sonia","Priyanka"};
		int[] size = {38,40,42,44};
		
		List  enames = new ArrayList(Arrays.asList(names));
		System.out.println(names);
		System.out.println(enames);
		for(int i=0;i<=enames.size()-1;i++) {
			System.out.println(enames.get(i));
		}
		
	}
}
