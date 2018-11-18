package com.c2t.edureka.locate.del;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumFireFox {

	public static void main(String[] args) {
		
		String url = "https://www.google.com/";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		
	}
}