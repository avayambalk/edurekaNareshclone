package com.c2t.edureka.ist830.module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
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

public class TestNg1 {
	
	
	@Test(dependsOnMethods={"test2"})
	public void test1(){
		System.out.println("test1");
	}
	
	@Test()
	public void test2(){
		System.out.println("test2");
	}
	
	@Test()
	public void test2_2(){
		System.out.println("test2_2");
		throw new RuntimeException();
	}

}
