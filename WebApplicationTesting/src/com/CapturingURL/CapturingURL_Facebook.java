package com.CapturingURL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingURL_Facebook {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://facebook.com";
		
		driver = new FirefoxDriver();
		driver.get(url);

		// Title
		System.out.println(" The title of facebook home is : "+driver.getTitle());
		
		if(driver.getTitle().contains("Facebook"))
		{
			System.out.println("TItle matched - PASS");
		}
		else
		{
			System.out.println("Title not matched - FAIL");
		}
		
		String expected_Url="facebook.com";
		System.out.println(" The expected Url of facebook home Page is : "+expected_Url);
		
		String actual_URL=driver.getCurrentUrl();
		System.out.println(" The actual Url of facebook home page is :"+actual_URL);
				
		if(actual_URL.contains(expected_Url))
		{
			System.out.println(" Successfully navigated to Facebook HOme Page - PASS");
		}
		else
		{
			System.out.println(" Failed to launch Facebook Home Page  - FAIL");
		}
		
		driver.quit();
				
	}

}
