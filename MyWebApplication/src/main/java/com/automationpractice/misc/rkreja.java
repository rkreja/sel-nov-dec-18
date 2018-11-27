package com.automationpractice.misc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class rkreja extends TestBase{

	

	@Test
	public void implicitDemo() {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver-windows-32bit.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		driver.findElement(By.xpath("//button[@class='btn btn-primary1']")).click();
		
		
	}
	
	
	
}
