package com.c2t.edureka.module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
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

public class TestNG4 {

	@BeforeTest
	public void beforeTest(){
		String url = "https://www.facebook.com/";
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
	}

	@Test
	public void test2() {
		System.out.println("test2");
		long l1 = Thread.currentThread().getId();
		System.out.println("TestNG4/l1="+l1);
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
		long l2 = Thread.currentThread().getId();
		System.out.println("TestNG4/l2="+l2);
	}
	
	

}