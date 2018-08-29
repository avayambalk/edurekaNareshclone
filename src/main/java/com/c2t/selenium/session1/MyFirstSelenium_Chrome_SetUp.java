package com.c2t.selenium.session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSelenium_Chrome_SetUp {

	public static void main(String[] args) {
		String url = "https://www.google.com/";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
	}
}