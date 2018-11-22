package com.automationpractice.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@BeforeSuite
	public void openBrowser() {
		System.err.println("Browser Opened");
	}
	
	@AfterSuite
	public void closeBrowser() {
		System.err.println("Browser closed");
	}
	
	@BeforeMethod
	public void getTestData() {
		System.err.println("data retrieved");
	}
	@AfterMethod
	public void cleanUpData() {
		System.err.println("data removed");
	}
	
	@Test
	public void loginWithNormalUser() {
		System.out.println("this is my login test");
	}
	
	@Test
	public void loginWithAdminUser() {
		System.out.println("this is my login test");
	}
	
	@Test
	public void loginWithModeratorUser() {
		System.out.println("this is my login test");
	}
	
	
	

}
