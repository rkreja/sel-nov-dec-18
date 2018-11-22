package com.automationpractice.misc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImplicitAndExplicitDemo {
	
	
	
	
	
	@Test
	public void implicitWaitDemo() {
		
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver-windows-32bit.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");		
		driver.findElement(By.xpath("//button[text()='click to see the date and time']")).click();
		

		
		
	}
	
	
	@Test
	public void explicitWaitDemo() {
		
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver-windows-32bit.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.textToBe(By.xpath("//p[contains(text(),'Dream')]"), "“Dream is not the thing you see in sleep but is that thing that doesn't let you sleep.”"));
		
		String quote=driver.findElement(By.xpath("//p[contains(text(),'Dream')]")).getText();
		Assert.assertEquals(quote, "“Dream is not the thing you see in sleep but is that thing that doesn't let you sleep.”");

		
		
	}
	
	
	
	

}
