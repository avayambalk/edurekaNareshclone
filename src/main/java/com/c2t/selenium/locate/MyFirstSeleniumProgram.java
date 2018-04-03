package com.c2t.selenium.locate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumProgram {
	public static void main(String[] args) {

		// getCurrentUrl
		// getTitle
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/LocatingMultipleElements.html");
	}
}
