package com.automationpractice.testnggroupdemo;

import org.testng.annotations.Test;

public class ClaimTests {
	
	@Test(groups = {"funtional-test"})
	public void standardClaim() {
		System.err.println("standard claim");
	}
	@Test(groups = {"funtional-test"})
	public void claimedByCustomer() {
		System.err.println("customers claim");
	}
	@Test(groups = {"integration-test"})
	public void claimedByCustomerService() {
		System.err.println("claimed by customer service");
	}
}
