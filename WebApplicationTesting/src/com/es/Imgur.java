package com.es;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Imgur {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://imgur.com");
		
		driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[1]/div[2]/div[2]/a[1]")).click();
		
		driver.findElement(By.className("PopUpActions-filePicker")).click();

	}

}
