package com.c2t.edureka.ist830.module2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Date;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/edureka/ist830/module2/LocatingMultipleElements.html");
		
		
		Options options = driver.manage();
		Timeouts timeout = options.timeouts();
		timeout.implicitlyWait(5, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		long timeBefore = new Date().getTime();
		
		
		try {
			WebElement we = driver.findElement(By.id("fname"));
			we.sendKeys("pradeep");
				
		} catch (Exception e) {
			
			long timeAfter = new Date().getTime();
			
			long diff = timeAfter - timeBefore;
			System.out.println("diff="+diff);
			
			
		}
		
		
		long timeAfter2 = new Date().getTime();
		
		long diff2 = timeAfter2 - timeBefore;
		System.out.println("diff2="+diff2);
		

		

	}

}