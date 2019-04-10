package com.automationpractice.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {
	
	public static WebDriver driver;
	

	
	@BeforeMethod
	@Parameters({"browser"})
	public void init(@Optional("chrome") String browser) {
		String os=System.getProperty("os.name");
		
		if (browser.equals("chrome")) {
			if(!os.contains("Windows")) {
				System.setProperty("webdriver.chrome.driver", "lib/chromedriver-linux-32bit");
			}else {
				System.setProperty("webdriver.chrome.driver", "lib\\chromedriver-windows-64bit.exe");
			}
			driver = new ChromeDriver();
		}else if(browser.equals("internetexplorer")) {
			System.setProperty("webdriver.ie.driver", "lib/internetexplorerdriver-windows-32bit.exe");
			driver = new InternetExplorerDriver();
		}else {
			System.err.println("invalid browser name was given in xml parameter. Valid values are: chrome,internetexplorer");
		}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public void highLightElement(WebElement e) {
		((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','border:4px solid red');", e);
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}

}
