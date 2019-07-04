package com.CapturingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingTItle_Bing {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://bing.com";
		
		driver = new FirefoxDriver();
		driver.get(url);

		String bing_Title=driver.getTitle();
		
		System.out.println(" The title of Bing Home page is : "+bing_Title);
		
		driver.quit();
		
		
		
		
		

	}

}
