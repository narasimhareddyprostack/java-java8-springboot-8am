package com.OptionalEx;

import java.lang.StackWalker.Option;
import java.util.Optional;

public class Test {

	public static void main(String[] args) {
	
		String[] enames=new String[20];
		enames[2] = "Rahul Gandhi";
		
		Optional<String>  isNull = Optional.ofNullable(enames[2]);
		System.out.println(isNull.get());
		//System.out.println(isNull.isPresent());
		if(isNull.isPresent()) {
			System.out.println(enames[2].length());
		}
		else {
			System.out.println("String is null!");	
			
		}

	}

}
