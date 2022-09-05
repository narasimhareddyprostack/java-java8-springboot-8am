package com.all;

import com.all.*;

public class Test {
	public static void main(String[] args) {
		Savings_Account a1=new Savings_Account();
		a1.setAcc_Id(101);
		a1.setAcc_Name("Rahul Gandhi");
		a1.setAcc_Amount(5000);
		
		a1.setMin_Bal(500);
		
		//a1.cal_Bal();
		
		Current_Account a2=new Current_Account();
		a2.setAcc_Id(102);
		a2.setAcc_Name("Priyanka");
		a2.setAcc_Amount(500000);
		a2.setMin_Bal(500);
	
		//a2.cal_Bal();
		
		AccountService.get_AccountService(a1);
		AccountService.get_AccountService(a2);
	}
}
