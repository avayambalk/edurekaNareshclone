package com.c2t.ist830;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class MyTestNg {
	
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod(){
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(
				"file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/test/java/com/c2t/frame/ParentFrame.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void firstName(){
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("firstname");
	}

}
