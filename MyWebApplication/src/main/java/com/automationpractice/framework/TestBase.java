package com.automationpractice.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void init() {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver-windows-32bit.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@AfterSuite
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}

}
