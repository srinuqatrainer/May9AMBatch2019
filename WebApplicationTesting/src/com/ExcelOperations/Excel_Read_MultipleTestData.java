package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("./src/com/ExcelFiles/MultipleTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet =	workbook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum(); // identifying active rows in the sheet
		
		for(int i=0;i<=rowCount;i++) // goes to all the active rows
		{
			Row r=sheet.getRow(i);
			int cellCount=r.getLastCellNum(); // identifying the active cells in the Row
			
			for(int j=0;j<cellCount;j++)
			{
				String data=r.getCell(j).getStringCellValue();
				System.out.print(data+" ");
			}
			System.out.println();
		}
		

	}

}
