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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class TestNG3 {

	@Test(priority=3, enabled=false)
	public void a() {
		System.out.println("a");
	}
	
	
	@Parameters({"email","password"})
	@Test(priority=1)
	public void test2(String val1, String val2) {
		System.out.println("val1="+val1);
		System.out.println("val2="+val2);
		System.out.println("test2");
	}
	
	@Test(priority=0)
	public void test1() {
		System.out.println("test1");
	}

}
