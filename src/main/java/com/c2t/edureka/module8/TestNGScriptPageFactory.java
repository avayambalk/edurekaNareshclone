package com.c2t.edureka.module8;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class TestNGScriptPageFactory {
	
	String url = "https://www.facebook.com/";
	WebDriver driver;
	FacebookPomPageFactory fbPom;
	
	@BeforeTest
	public void setUp(){
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		fbPom = new FacebookPomPageFactory(driver);
		System.out.println("fbPom="+fbPom);
		
	}
	
	@Test(priority = 1)
	public void openFacebook(){
		String expectedValue = "Facebook – log in or sign up";
		//opens the page
		driver.get(url);
		
		String actualTitle = driver.getTitle();
		
		assertEquals(actualTitle, expectedValue);

	}
	
	@Test(priority = 2)
	public void loginToFb(){
		
		fbPom.setEmail("message4naresh@gmail.com");
		fbPom.setPassword("password");
		fbPom.clickLogin();
		
	}
	
	

}
