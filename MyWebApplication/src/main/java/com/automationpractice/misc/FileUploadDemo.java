package com.automationpractice.misc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadDemo {

	
	
	@Test
	public void uploadFileBySendKeys() {
		
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver-windows-32bit.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		driver.findElement(By.id("demoFileUpload")).sendKeys("F:\\Time And Training\\Demo Folder\\testdata.xlsx");
		
		
		
		
	}
}
