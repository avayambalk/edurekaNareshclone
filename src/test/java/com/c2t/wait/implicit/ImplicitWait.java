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
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String baseUrl = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/LocatingMultipleElements.html";
			// String tagName = "";
			driver.get(baseUrl);

			lStartTime = new Date().getTime();
			// finds elements based on the value of the "class" attribute
			String className = driver.findElement(By.className("w3-input")).getTagName();
			System.out.println("className=" + className);
			Assert.assertEquals(className, "input");
			lEndTime = new Date().getTime();
			difference = lEndTime - lStartTime;

			System.out.println("Elapsed milliseconds-1: " + difference);

			lStartTime2 = new Date().getTime();
			// finds elements based on the value of the "class" attribute
			// Search for element which does not have this class.
			className = driver.findElement(By.className("w-input")).getTagName();
			System.out.println(className);

		} catch (Exception e) {
			lEndTime2 = new Date().getTime();
			difference2 = lEndTime2 - lStartTime2;
			System.out.println("Elapsed milliseconds-2: " + difference2);
			System.out.println("Elapsed seconds-2: " + (float) difference2 / 1000);
			Assert.assertTrue(false);
		}

		driver.close();
		System.exit(0);
	}
}
