package com.automationpractice.misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class ForLoopDemo extends TestBase{
	
	@Test
	public void selectAllCheckboxesByForEach() throws InterruptedException {
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));

		
		for(WebElement e:checkboxes) {
			e.click();		
		}
		
		Thread.sleep(3000);
	}
	
	
	
	@Test
	public void selectAllCheckboxesByForLoop() throws InterruptedException {
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
//		
//		WebElement checkbox_1=checkboxes.get(0);
//		WebElement checkbox_2=checkboxes.get(1);
//		WebElement checkbox_3=checkboxes.get(2);
//		WebElement checkbox_4=checkboxes.get(3);
//		WebElement checkbox_5=checkboxes.get(4);
//		WebElement checkbox_6=checkboxes.get(5);
		
		for (int i = 0; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
			System.err.println("driver selected the number of checkbox = "+(i+1));
		}
		
		Thread.sleep(3000);
	}
	@Test
	public void selectAllCheckboxesByForLoop_standard() throws InterruptedException {
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		driver.findElement(By.id("exampleRadios1")).click();
		driver.findElement(By.xpath("(//input[@id='exampleRadios2'])[3]")).click();
		driver.findElement(By.xpath("(//input[@id='exampleRadios3'])[2]")).click();
		driver.findElement(By.id("exampleRadios4")).click();
		driver.findElement(By.id("exampleRadios5")).click();
		driver.findElement(By.id("exampleRadios6")).click();
		Thread.sleep(3000);
	}

}
