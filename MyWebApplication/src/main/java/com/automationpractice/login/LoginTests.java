package com.automationpractice.login;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class LoginTests extends TestBase{
	
	@Test
	public void login_with_vaid_userid_and_password() {
			
		//Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
		
		//Click Sign in button from top right corner of the page
		driver.findElement(By.className("login")).click();
		
		//Enter valid email address 'abc213@mailinator.com' in email address text field of right side
		driver.findElement(By.id("email")).sendKeys("abc213@mailinator.com");
		
		//Enter valid password 'abc1234' in password text field
		driver.findElement(By.id("passwd")).sendKeys("abc1234");
		
		//Click 'Sign in' button
		driver.findElement(By.id("SubmitLogin")).click();
		
		//Verify 'MY ACCOUNT' text displayed
		String myaccounttxt = driver.findElement(By.className("page-heading")).getText();
		Assert.assertEquals(myaccounttxt, "MY ACCOUNT");
		
		//Verify 'Welcome to your account. Here you can manage all of your personal information and orders.' text displayed
		String wwelcomeMsg=driver.findElement(By.className("info-account")).getText();
		Assert.assertEquals(wwelcomeMsg,"Welcome to your account. Here you can manage all of your personal information and orders.");
		
		//Verify 'My personal information' text displayed
		String personalInfoTxt=driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span")).getText();
		Assert.assertEquals(personalInfoTxt, "MY PERSONAL INFORMATION");
		
		//Click 'Sign out' button from top right corner
		driver.findElement(By.className("logout")).click();

	}


	
}
