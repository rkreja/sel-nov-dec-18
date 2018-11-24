package com.automationpractice.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {
	
	public WebDriver driver;
	
	@BeforeSuite
	@Parameters({"browser"})
	public void init(@Optional("chrome") String browser) {
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "lib\\chromedriver-windows-32bit.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("internetexplorer")) {
			System.setProperty("webdriver.ie.driver", "lib\\internetexplorerdriver-windows-32bit.exe");
			driver = new InternetExplorerDriver();
		}else {
			System.err.println("invalid browser name was given in xml parameter. Valid values are: chrome,internetexplorer");
		}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@AfterSuite
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}

}
