package com.KeyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewTours_LogInTest extends BaseTest{
	
	
	@Test
	public void logIn() throws IOException
	{
FileInputStream file1 = new FileInputStream
								("./src/com/ApplicationTestDataFiles/NewTours_LogInTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file1);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowCount;i++)
		{
			Row r=sheet.getRow(i);
		
			// identifying the properties file in the project
		FileInputStream file = new FileInputStream("./newTours.properties");
		
		// Creating an object for Properties class - java.util package
		Properties pr = new Properties();
		
		// using Properties class Object loading the Properties file
		pr.load(file);
		
		// identifying the property of element based on properties file using getProperty method
driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys(r.getCell(0).getStringCellValue());
		
driver.findElement(By.name(pr.getProperty("Password"))).sendKeys(r.getCell(1).getStringCellValue());
		
driver.findElement(By.name(pr.getProperty("SignIn"))).click();
		
		
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
		FileOutputStream file2 = new FileOutputStream("./src/com/ApplicationTestResultFiles/NewTours_Hybrid_LogInTestResult.xlsx");
		workBook.write(file2);
		
		driver.navigate().back();
}
		
	}

}
