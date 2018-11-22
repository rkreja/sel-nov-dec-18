package com.automationpractice.misc;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class DriverSwitchDemo extends TestBase{
	
/*	@Test
	public void switchToWindowDemo() {
		
		driver.getWindowHandles();
		
		driver.get("http://automationpractice.com/index.php");
		
		
		driver.switchTo().window(nameOrHandle)
		
		System.out.println("manually open new window");
		
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		

		
	}
	*/
	
	@Test
	public void switchToFrameDemo() {
		driver.get("https://html.com/tags/iframe/");
		
//		driver.switchTo().frame(3);
		driver.switchTo().frame("aswift_2");
		driver.switchTo().frame("google_ads_frame3");
		
		driver.findElement(By.xpath("//a[@id='ala3']")).click();

	}
	
	@Test
	public void demoAlertPopup() {
		
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		driver.findElement(By.xpath("//button[text()='click to see the date and time']")).click();
		driver.switchTo().alert().accept();
		driver.close();
		
	}
	
	
	

}
