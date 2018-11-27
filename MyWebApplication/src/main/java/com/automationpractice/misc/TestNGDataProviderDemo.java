package com.automationpractice.misc;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class TestNGDataProviderDemo extends TestBase{
	
	
	
	
	@Test(dataProvider="listOfSites")
	public void nav(String url) {
		driver.get(url);
	}
	
	
	
	@DataProvider(name="listOfSites")
	public Object[][] getWebSites(){
		return new Object[][] {
			{"http://www.cnn.com"},
			{"http://www.bbc.com"},
			{"http://www.facebook.com"},
			{"http://www.twitter.com"},
			{"http://www.automationpractice.com"},
			{"http://www.timeandtraining.net"}
		};
	}
	
	@DataProvider(name="testdata")
	public Object[][] getLoginData(){
		return new Object[][] {
			{"user1","password1"},				
			{"user2", "password2"}
		};
	}
	
	
	@DataProvider(name="searchData")
	public Object[][] searchData(){
		return new Object[][] {
			{"sampleData1","sampleData2","sampleData3"},				
			{"sampleData1","sampleData2","sampleData3"},
			{"sampleData1","sampleData2","sampleData3"},
			{"sampleData1","sampleData2",""},
			{"sampleData1","sampleData2","sampleData3"},
			{"sampleData1","sampleData2","sampleData3"},
			{"sampleData1","sampleData2","sampleData3"}
		};
	}
	
	
	
	@Test(dataProvider="testdata")
	public void login(String userid, String pwd) {
		System.err.println("Login using userid: "+userid+" and password "+pwd);
	}
	
	@Test(dataProvider="searchData")
	public void search(String data1, String data2, String data3) {
	
	}

}
