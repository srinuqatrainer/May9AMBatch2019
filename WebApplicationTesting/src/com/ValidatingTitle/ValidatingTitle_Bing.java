package com.ValidatingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTitle_Bing {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://bing.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		String expected_Title="bing";
		System.out.println(" The expected title of Bing Home Page is : "+expected_Title);

		String actual_Title=driver.getTitle();
		
		System.out.println(" The actual title of Bing Home page is : "+actual_Title);
		
		if(actual_Title.equalsIgnoreCase(expected_Title))
		{
			System.out.println(" The Title matched - PASS");
		}
		else
		{
			System.out.println(" The title not matched - FAIL");
		}

		driver.quit();
	}

}
