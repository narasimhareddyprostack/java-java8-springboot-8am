package com.DateAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DateEx2 {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalDate dob = LocalDate.of(1983, 7, 11);
		System.out.println(dob);
		
		Period p = Period.between(dob, date);
		System.out.println("No of Years:"+p.getYears()+"No of Months:"+p.getMonths()+"Days:"+p.getDays());
		
		

	}

}
