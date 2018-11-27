package com.automationpractice.misc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class JavaScriptExecutorDemo extends TestBase{
	@Test
	public void login_with_vaid_userid_and_password() {
			
		//Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
		
		//Click Sign in button from top right corner of the page
		WebElement signInBtn=driver.findElement(By.className("login"));
		highLightElement(signInBtn);
		signInBtn.click();
		
		//Enter valid email address 'abc213@mailinator.com' in email address text field of right side
		WebElement emailTxtField=driver.findElement(By.id("email"));
		highLightElement(emailTxtField);
		emailTxtField.sendKeys("abc213@mailinator.com");
		
		//Enter valid password 'abc1234' in password text field
		WebElement pwdTxtField=driver.findElement(By.id("passwd"));
		highLightElement(pwdTxtField);
		pwdTxtField.sendKeys("abc1234");
		
		//Click 'Sign in' button
		WebElement btn=driver.findElement(By.id("SubmitLogin"));
		highLightElement(btn);
		btn.click();
	}
	@Test
	public void executeSomeRandomJS() {
		driver.get("http://automationpractice.com/index.php");
		
		
		//set text in search field
		
		//Option1:
		//driver.findElement(By.id("search_query_top")).sendKeys("test");
		
		//Option2:
		//Actions actions = new Actions(driver);
		//actions.moveToElement(driver.findElement(By.id("search_query_top"))).sendKeys("test").build().perform();
		
		
		//Option3:
		((JavascriptExecutor)driver).executeScript("document.getElementById('search_query_top').value='test';");
		
	}

}
