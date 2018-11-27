package com.automationpractice.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class TestngAnnotationsDemo extends TestBase{

	@Test
	public void t1() {
		driver.get("http://www.bbc.com");
	}
	@Test
	public void t2() {
		driver.get("http://www.cnn.com");	
	}
	@Test
	public void t3() {
		driver.get("http://www.twitter.com");
	}
	@Test
	public void t4() {
		driver.get("http://www.facebook.com");
	}
	@Test(enabled=false)
	public void browserTestWithParameter() {
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(enabled=false)
	public void mouseOverByActions() {

	driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
	Actions actions = new Actions(driver);
	WebElement red_button=driver.findElement(By.xpath("//li[contains(@class,'bg-danger')]"));
	actions.moveToElement(red_button).build().perform();
	
	String msg=driver.findElement(By.id("mouseovertext")).getText();
	Assert.assertEquals(msg, "Red means danger");
	
	WebElement green_button=driver.findElement(By.xpath("//li[contains(@class,'bg-success')]"));
	actions.moveToElement(green_button).build().perform();
	msg=driver.findElement(By.id("mouseovertext")).getText();
	Assert.assertEquals(msg, "Green for Go..");
	
	WebElement blue_button=driver.findElement(By.xpath("//li[contains(@class,'bg-primary')]"));
	actions.moveToElement(blue_button).build().perform();
	msg=driver.findElement(By.id("mouseovertext")).getText();
	Assert.assertEquals(msg, "Sky is Blue");
	
		
	}
	
}
