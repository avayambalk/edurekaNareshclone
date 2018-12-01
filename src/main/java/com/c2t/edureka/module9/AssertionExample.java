package com.c2t.edureka.module9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.c2t.edureka.module8.FacebookPom;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class AssertionExample {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test1(){
		
		String exepectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, exepectedTitle);
		
		
	}
}
