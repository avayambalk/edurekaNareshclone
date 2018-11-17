package com.c2t.edureka.module2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumFireFox {

	public static void main(String[] args) {
		
		String url = "https://www.google.com/";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		
		//Car c = new Maruti();
		
		//Ctrl + shift + T
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
	
	}
}