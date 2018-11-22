package com.automationpractice.misc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectObjectDemo {
	
	
	
	
	@Test
	public void selectLanguage() {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver-windows-32bit.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		WebElement e =driver.findElement(By.xpath("(//select)[1]"));
		Select languageDropDown = new Select(e);
		
		languageDropDown.selectByVisibleText("PHP");
		
	
		
	}
	
	

}
