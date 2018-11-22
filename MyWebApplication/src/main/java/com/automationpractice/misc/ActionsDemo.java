package com.automationpractice.misc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsDemo {
	
	
	@Test
	public void keyPressByActions() {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver-windows-32bit.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
			
		Actions actions =  new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();
		
		
		
	}
	

	@Test
	public void dragnDropByActions() {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver-windows-32bit.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		Actions actions = new Actions(driver);
		WebElement source = driver.findElement(By.id("drag"));
		WebElement target = driver.findElement(By.id("drop"));
		actions.dragAndDrop(source, target).build().perform();
		
		
	}
	@Test
	public void mouseOverByActions() {
	System.setProperty("webdriver.chrome.driver", "lib\\chromedriver-windows-32bit.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
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
	
	driver.close();
		
	}
	
	
	
	
	
}
