package com.automationpractice.testnggroupdemo;

import org.testng.annotations.Test;

public class ProductPurchaseTests {

	@Test(groups = {"funtional-test","integration-test"})
	public void purchaseSingleItem() {
		System.err.println("single item purchase");
	}
	@Test(groups = {"integration-test"})
	public void purchaseWithExchange() {
		System.err.println("purchase with exchange");
	}
	@Test(groups = {"funtional-test"})
	public void returnPurchase() {
		System.err.println("return the purchase");
	}
	
}
