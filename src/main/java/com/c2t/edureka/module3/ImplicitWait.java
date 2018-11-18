package com.c2t.edureka.module3;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/edureka/module2/LocatingMultipleElements.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(url);
		
		driver.findElement(By.name("firstname"));
		
		
		
		
	
	}
}