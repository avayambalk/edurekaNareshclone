package com.c2t.selenium.locate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumChrome {

	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		//System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.google.co.in/";
		// launch Firefox and direct it to the Base URL
		driver.get(baseUrl);
		String title = driver.getTitle();
		System.out.println("title="+title);
	}
}