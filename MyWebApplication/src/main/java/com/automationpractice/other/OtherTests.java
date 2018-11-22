package com.automationpractice.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class OtherTests extends TestBase{
	
	
	
	@Test
	public void Send_message_using_contact_us_form_other_001() {
		
//		Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
//		Click Sign in button from top right corner of the page
		driver.findElement(By.className("login")).click();
//		Enter valid email address 'abc213@mailinator.com' in email address text field of right side
		driver.findElement(By.id("email")).sendKeys("abc213@mailinator.com");
//		Enter valid password 'abc1234' in password text field
		driver.findElement(By.id("passwd")).sendKeys("abc1234");
//		Click 'Sign in' button
		driver.findElement(By.id("SubmitLogin")).click();
//		Click Contact us button from top right menu
		driver.findElement(By.xpath("//a[@title='Contact Us']")).click();
//		Select 'Webmaster' from Subject Heading drop down
		WebElement element=driver.findElement(By.id("id_contact"));
		Select dropdown = new Select(element);
		dropdown.selectByValue("1");
//		Type message 'I have not received my order yet' in Message text area
		driver.findElement(By.id("message")).sendKeys("I have not received my order yet");
//		Click Send button
		driver.findElement(By.id("submitMessage")).click();
//		Verify 'Your message has been successfully sent to our team.' message displayed
		String msg=driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText();
		
		Assert.assertEquals(msg, "Your message has been successfully sent to our team.");
		
		driver.close();
	}
	

	

}
