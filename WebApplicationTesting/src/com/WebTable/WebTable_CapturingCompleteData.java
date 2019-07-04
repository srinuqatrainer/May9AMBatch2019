package com.WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable_CapturingCompleteData {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="https://www.timeanddate.com/worldclock/";
		
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		// Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		// First Row of First Column
		// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		
		// Last Row of Last Column
		// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		
		for(int i=1;i<=36;i++) // Will goto all the Rows
		{
			for(int j=1;j<=8;j++) // will goto Every Row of All the Columns
			{
String data=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div"
		+ "[1]/div/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data+" ");
			}
			System.out.println();
			}
		driver.close();
		
		
		

	}

}
