package com.WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable_CompleteTestData {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="https://www.timeanddate.com/worldclock/";
		
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		// Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Xpath of Complete Web Table
		// /html/body/div[1]/div[6]/section[1]/div
		
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div"));
		
		List<WebElement>rows=driver.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows.size();i++) // will goto all the Rows
		{
			// should go to a particular Row
			List<WebElement>columns=rows.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<columns.size();j++) // goes to Every Row of all the columns
			{
				String data=columns.get(j).getText();
				System.out.print(data + " ");
				
			}
			System.out.println();
	}
		
		driver.quit();
		

	}

}
