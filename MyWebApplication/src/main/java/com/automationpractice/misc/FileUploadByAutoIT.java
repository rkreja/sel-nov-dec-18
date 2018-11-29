package com.automationpractice.misc;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class FileUploadByAutoIT extends TestBase{
	
	
	
	
	@Test
	public void uploadFile() throws IOException, InterruptedException {
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		driver.findElement(By.id("demoFileUpload")).click();
		Runtime.getRuntime().exec("F:\\Time And Training\\Demo Folder\\sel-nov-dec-18\\fileuploadDemo.exe");

		Thread.sleep(5000);
		
	}
	
	

}
