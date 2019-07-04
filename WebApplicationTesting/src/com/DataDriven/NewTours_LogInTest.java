package com.DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewTours_LogInTest extends BaseTest{
	
	
	@Test
	public void logIn() throws IOException, InterruptedException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\srinivas1\\Desktop\\May9AMBatch\\WebApplicationTesting\\src\\com\\ApplicationTestDataFiles\\NewTours_LogInTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// identify the total number of active rows with test data
		int rowCount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowCount;i++)
		{
			Row r=sheet.getRow(i);
			
			// <input type="text" name="userName" size="10">
			
						
			driver.findElement(By.name("userName")).clear();
			driver.findElement(By.name("userName")).sendKeys(r.getCell(0).getStringCellValue());
			
			// <input type="password" name="password" size="10">
			
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(r.getCell(1).getStringCellValue());
			
			// <input type="image" name="login" value="Login" src="/images/btn_signin.gif?osCsid=a480b7bb28903609ec93a2fcdfc3220a" width="58" height="17" alt="Sign-In" border="0">
			
			driver.findElement(By.name("login")).click();
			
			String expected_Title="Find";
			System.out.println(" The expected title after successfull login is :"+expected_Title);
			
			String actual_Title=driver.getTitle();
			System.out.println(" The actual title after logIn is :"+actual_Title);
			
			if(actual_Title.contains(expected_Title))
			{
				System.out.println(" LogIn Successfull - PASS");
				r.createCell(2).setCellValue("LogIn Successfull - PASS");
			}
			else
			{
				System.out.println(" LogIn Failed - FAIL");
				r.createCell(2).setCellValue("LogIn Failed - FAIL");
			}
			
FileOutputStream file1 = new FileOutputStream("C:\\Users\\srinivas1\\Desktop\\May9AMBatch\\WebApplicationTesting\\src\\com\\ApplicationTestResultFiles"
		+ "NewTours_LogInTestResults.xlsx");
			workBook.write(file1);
			
			driver.navigate().back();

		//	driver.navigate().refresh();
		}
		
		
	}

}
