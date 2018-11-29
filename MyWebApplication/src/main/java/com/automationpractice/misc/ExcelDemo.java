package com.automationpractice.misc;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;
import com.rkreja.Excel;

public class ExcelDemo extends TestBase{

	
	@DataProvider(name="getUsersData")
	public Object[][] testData() {
		Excel myexcel = new Excel("F:\\Time And Training\\Demo Folder\\users.xlsx", "Sheet1");
		
		return myexcel.getRowValuesForDataProvider();
	}
	
	@Test(dataProvider="getUsersData")
	public void register_with_testng_dataprovider(String uid, String pwd) {
		
			
			driver.get("http://automationpractice.com/index.php");
			driver.findElement(By.className("login")).click();
			driver.findElement(By.id("email_create")).sendKeys(uid);
			driver.findElement(By.id("SubmitCreate")).click();
			driver.findElement(By.id("passwd")).sendKeys(pwd);
			
			System.err.println("Account created with userid: "+uid+" and password: "+pwd);
		
		
		
	}
	
	
	@Test
	public void register() {
		
		
		Excel myexcel = new Excel("F:\\Time And Training\\Demo Folder\\users.xlsx", "Sheet1");
		
		
		for (int i = 1; i <= myexcel.rowCount(); i++) {
			
			String uid = myexcel.getCellValue(i, 1);
			String pwd = myexcel.getCellValue(i, 2);
			
			
			driver.get("http://automationpractice.com/index.php");
			driver.findElement(By.className("login")).click();
			driver.findElement(By.id("email_create")).sendKeys(uid);
			driver.findElement(By.id("SubmitCreate")).click();
			driver.findElement(By.id("passwd")).sendKeys(pwd);
			
			System.err.println("Account created with userid: "+uid+" and password: "+pwd);
		}
		
		
	}
	
	@Test
	public void loopTestData() {
		
		Excel myexcel = new Excel("F:\\Time And Training\\Demo Folder\\testdata2.xlsx", "Sheet1");
		
		
//		System.err.println(myexcel.getCellValue(1, 2));
//		System.err.println(myexcel.getCellValue(2, 2));
		
		
		
		for (int i = 1; i <= myexcel.rowCount(); i++) {
			System.err.println(myexcel.getCellValue(i, 2));
		}
		
		
	}
	
	
	@Test
	public void readAndWriteWithExcel() {
		
		Excel myexcel = new Excel("F:\\Time And Training\\Demo Folder\\testdata2.xlsx", "Sheet1");
		int total_column=myexcel.columnCount();
		System.err.println(total_column);
		
		int row_count=myexcel.rowCount();
		System.err.println(row_count);
		
		
		String val=myexcel.getCellValue(16, 2);
		System.err.println(val);
		
		
		int col_index=myexcel.getColumnIndex("City Name");
		System.err.println(col_index);
		
	}
	

}
