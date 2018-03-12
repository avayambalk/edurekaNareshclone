package com.c2t.testng.assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAssertions {
	
	WebDriver driver;
	
	@BeforeTest
	public void lauchBrowser(){
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		
		WebDriver.Options opt = driver.manage();
		WebDriver.Window win = opt.window();
		win.maximize();
		
		//driver.manage().window().maximize();
		//String resourceDir = SeleniumUtil.getRootDir() + "LocatingMultipleElements.html";
		String resourceDir = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/LocatingMultipleElements.html";
		driver.get(resourceDir);
	}

	@Test
	public void assert1() {
		String expected = "My First Selenium!!!";

		String titleOfPage = driver.getTitle();
		
		Assert.assertEquals(titleOfPage, expected);
	}
	
	@Test
	public void assert2() {
		String s1 = "one";
		String s2 = "two";
		Assert.assertEquals(s1, s2);
	}

	@Test
	public void assert3() {
		String s1 = "one";
		String s2 = "one";
		Assert.assertEquals(s1, s2,"The values are not equal");
	}

	@Test
	public void assert4() {
		String s1 = "one";
		String s2 = "two";
		Assert.assertEquals(s1, s2,"The title of login page is not correct...");
	}	
}
