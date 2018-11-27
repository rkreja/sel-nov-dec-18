package com.automationpractice.misc;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class TestNGParameterDemo extends TestBase{
	
	
	@Test
	@Parameters({"username","password"})
	public void login(@Optional("rkreja") String userid, @Optional("xyz1234") String password) {
		System.out.println("Login with user: " + userid);
		System.out.println("Login with password: " + password);
	}


	
	@Test(enabled=false)
	@Parameters({"income","creditScore","interestRate","houseValue"})
	public void mortgageRate(double income, int creditScore, double interestRate, double houseValue) {
		System.out.println("CALCULATING MORTGAGE RATE:");
		System.out.println(income);
		System.out.println(creditScore);
		System.out.println(interestRate);
		System.out.println(houseValue);
		
	}

	
	

}
