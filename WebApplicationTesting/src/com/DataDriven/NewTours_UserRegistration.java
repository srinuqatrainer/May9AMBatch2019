package com.DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewTours_UserRegistration extends BaseTest {
	
	@Test(priority=1)
	public void register()
	{
		WebElement Register=driver.findElement(By.linkText("REGISTER"));
		Register.click();
	}
	
	
	@Test(priority=2)
	public void newUserRegistration() throws IOException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\srinivas1\\Desktop\\May9AMBatch\\WebApplicationTesting\\src\\com\\ApplicationTestDataFiles\\NewUserRegistrationTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowCount;i++)
		{
			Row r=sheet.getRow(i);
			
			driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
			
			// Type Casting
			double d=r.getCell(2).getNumericCellValue();
			long x=(long)d;
			String phoneNumber=Long.toString(x);
			
			
			driver.findElement(By.name("phone")).sendKeys(phoneNumber);
			driver.findElement(By.id("userName")).sendKeys(r.getCell(3).getStringCellValue());
			
			driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
			driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
			driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
			
			double a=r.getCell(7).getNumericCellValue();
			long y=(long)a;
			String postalCode=Long.toString(y);
			
			driver.findElement(By.name("postalCode")).sendKeys(postalCode);
			driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
			
			
			driver.findElement(By.id("email")).sendKeys(r.getCell(9).getStringCellValue());
			driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
			driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
			
			driver.findElement(By.name("register")).click();
			
			String expected_UserName=r.getCell(9).getStringCellValue();
			System.out.println(" The expected userName is : "+expected_UserName);

			
			// xpath of Registered UserName text
			// /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b
			
			String actual_UserRegistedText=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
			System.out.println(" The actual Registed UserName is : "+actual_UserRegistedText);
		
			if(actual_UserRegistedText.contains(expected_UserName))
			{
				System.out.println(" User registed Successfully - PASS");
				r.createCell(12).setCellValue("User registed Successfully - PASS");
			}
			else
			{
				System.out.println(" User Registration Failed - FAIL");
				r.createCell(12).setCellValue("User Registration Failed - FAIL");
			}
			
			FileOutputStream file1 = new FileOutputStream("C:\\Users\\srinivas1\\Desktop\\May9AMBatch\\WebApplicationTesting\\src\\com\\ApplicationTestResultFiles\\UserRegistrationTestResult.xlsx");
			workBook.write(file1);
			
			driver.navigate().back();
	//		driver.navigate().refresh();
		}
		
	}
	

}
