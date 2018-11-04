package com.c2t.edureka.module5;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
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

public class TestNGAddUser {
	
	WebDriver driver;
	
	@BeforeTest
	public void firstName(){
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://localhost:8888/connect2tech.in-Selenium-Automation-Java-1.x/users/add");
	}
	
	@Test(priority = 1)
	public void clickAdd(){
		driver.findElement(By.xpath(".//*[@id='userForm']/div[12]/div/button")).click();
	}
	
	
	@Test(priority = 1)
	public void verifyPasswordErrorMsg(){
		
		String expected = "Password is required!";
		
		String actual = driver.findElement(By.id("password.errors")).getText();
		System.out.println(actual);
		
		assertEquals(actual, expected);
	}
	
	

	
}
