package com.POM;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewTours_HomePageTesting extends BaseTest{
		
	@Test
	public void homePage()
	{
		WelcomeMercuryTours wmt = PageFactory.initElements(driver, WelcomeMercuryTours.class);
		
		wmt.SignOn();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		wmt.register();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		wmt.logIn("tutorial", "tutorial");
	}
	

}
