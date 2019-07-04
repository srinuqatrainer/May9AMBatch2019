package com.ApplicationDataToExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_CountryDropDown_Data_ExportToExcelSheet {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		// <a href="mercuryregister.php">REGISTER</a>
		driver.findElement(By.linkText("REGISTER")).click();
		
		// name="country" - property of Country Element
		
		WebElement country=driver.findElement(By.name("country"));
		
		List<WebElement>countryNames=country.findElements(By.tagName("option"));
		
		System.out.println("The number of Countries are :"+countryNames.size());
		
		FileInputStream file = new FileInputStream("./src/com/ExcelFiles/SingleTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		for(int k=0;k<countryNames.size();k++)
		{
			String countryName=countryNames.get(k).getText();
			System.out.println(countryName);
			
			Row r=sheet.createRow(k);
			Cell c=r.createCell(0);
			
			c.setCellValue(countryName);
			
			FileOutputStream file1 = new FileOutputStream("./src/com/ExcelFiles/SingleTestData.xlsx");
			workBook.write(file1);
		}
				driver.quit();


	}

}
