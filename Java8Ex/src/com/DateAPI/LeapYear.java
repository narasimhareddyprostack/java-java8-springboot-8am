package com.DateAPI;

import java.time.Year;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println(Year.of(2022).isLeap());
		if(Year.of(2022).isLeap()) {
			System.out.println("Yes ! Leap Year");
		}
		else {
			System.out.println("Not a a Leap Year");
		}
	}

}
