package com.ApplicationNavigation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Bing_ApplicationNavigation {

	public static void main(String[] args) {
		
		FirefoxDriver d = new FirefoxDriver();
		
		d.get("http://bing.com");
		
		d.navigate().to("http://facebook.com");
		
		d.close();

	}

}
