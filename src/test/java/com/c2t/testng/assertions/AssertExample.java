package com.c2t.testng.assertions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class AssertExample {
	
	private static WebDriver driver;

	
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.get("http://cookbook.seleniumacademy.com/Alerts.html");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void t1() {
		
		String expectedTitle = "Google1";
		
		String actualTitle = driver.getTitle();
		
		assertEquals(actualTitle, expectedTitle);
		
	}
	
}
