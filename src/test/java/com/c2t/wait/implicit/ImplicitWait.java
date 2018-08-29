package com.c2t.wait.implicit;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImplicitWait {

	@Test
	public void testWithOutWait() {

		WebDriver driver=null;
		
		long lStartTime = 0;
		long lEndTime = 0;
		long difference = 0;

		long lStartTime2 = 0;
		long lEndTime2 = 0;
		long difference2 = 0;

		try {
			System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
			driver = new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String baseUrl = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/LocatingMultipleElements.html";
			driver.get(baseUrl);

			
			// finds elements based on the value of the "class" attribute
			lStartTime = new Date().getTime();
			WebElement we = driver.findElement(By.className("w4-input"));
			

		
		} catch (Exception e) {
			
			System.out.println("exception = "+e);
			
			
			lEndTime2 = new Date().getTime();
			difference2 = lEndTime2 - lStartTime;
			System.out.println("Elapsed milliseconds-2: " + difference2);
			System.out.println("Elapsed seconds-2: " + (float) difference2 / 1000);
			Assert.assertTrue(false);
			
			
		}
		
		System.out.println("Done....");
		
		//driver.close();
		//System.exit(0);
	}
}
