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

public class TestNG2 {

	@BeforeTest
	public void before() {
		System.out.println("before..");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("beforeMethod");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("afterMethod");
	}
	
	@AfterTest
	public void after(){
		System.out.println("After..");
	}

}
