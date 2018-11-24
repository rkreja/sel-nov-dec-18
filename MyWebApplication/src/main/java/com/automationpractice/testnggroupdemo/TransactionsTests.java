package com.automationpractice.testnggroupdemo;

import org.testng.annotations.Test;

public class TransactionsTests {
	
	@Test(groups = {"funtional-test"})
	public void creditCardTransactions() {
		System.err.println("credit card transaction");
	}
	@Test(groups = {"integration-test"})
	public void ElectronicBankTransactions() {
		System.err.println("electronic bank transaction");
	}
	@Test(groups = {"integration-test"})
	public void paypalTransactions() {
		System.err.println("paypal transaction");
	}

}
