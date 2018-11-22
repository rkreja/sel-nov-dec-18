package com.automationpractice.search;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class SearchTests extends TestBase{
	
	
	@Test
	public void product_image_view_search_003() throws InterruptedException {
		
		
//		Go to http://automationpractice.com/index.php?id_product=7&controller=product
		driver.get("http://automationpractice.com/index.php?id_product=7&controller=product");
//		Verify there are 4 thumbnail on the page
		/*WebElement e = driver.findElement(By.xpath("//img[contains(@id,'thumb_')]"));
		e.getText();*/
		
		
		List<WebElement> total_thumbnails = driver.findElements(By.xpath("//img[contains(@id,'thumb_')]"));
		Assert.assertEquals(total_thumbnails.size(), 4);
		
		
		
		
//		click on the first thumbnail
		total_thumbnails.get(0).click();
		
		
//		verify popup displayed to slideshow
		WebElement close_button=driver.findElement(By.xpath("//a[@title='Close']"));
		Assert.assertNotNull(close_button);
		
//		Click next button and verify image changes, do the same for four images
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		Thread.sleep(1000);
		String src=driver.findElement(By.xpath("//img[@class='fancybox-image']")).getAttribute("src");
		Assert.assertEquals(src.contains("img/p/2/1"), true);
		
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		Thread.sleep(1000);
		src=driver.findElement(By.xpath("//img[@class='fancybox-image']")).getAttribute("src");
		Assert.assertEquals(src.contains("img/p/2/2"), true);
		
		
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		Thread.sleep(1000);
		src=driver.findElement(By.xpath("//img[@class='fancybox-image']")).getAttribute("src");
		Assert.assertEquals(src.contains("img/p/2/3"), true);
		
		
		
//		close the popup
		driver.findElement(By.xpath("//a[@title='Close']")).click();
		driver.close();
	
	
	}
	


}
