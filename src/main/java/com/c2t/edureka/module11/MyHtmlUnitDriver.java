package com.c2t.edureka.module11;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyHtmlUnitDriver {

	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/JavaSeleniumEdureka/driver/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
	}
}