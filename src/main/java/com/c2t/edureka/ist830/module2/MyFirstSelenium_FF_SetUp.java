package com.c2t.edureka.ist830.module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSelenium_FF_SetUp {

	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		System.out.println(driver.getTitle());
		String str = driver.findElement(By.xpath("//div[starts-with(text(),'Facebook helps you')]")).getText();
		System.out.println(str);
		
	}
}