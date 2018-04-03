package com.c2t.selenium.locate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSelenium {

	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.google.co.in/";
		// launch Firefox and direct it to the Base URL
		driver.get(baseUrl);
		String title = driver.getTitle();
		System.out.println("title="+title);
	}
}