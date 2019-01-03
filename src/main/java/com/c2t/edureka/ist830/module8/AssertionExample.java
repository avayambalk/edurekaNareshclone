package com.c2t.edureka.ist830.module8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class AssertionExample {
	
	WebDriver driver;

	@BeforeTest
	public void before() {
		String url = "https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@Test
	public void test1(){
		
		String expectedTitle = "Welcome";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
	}
}
