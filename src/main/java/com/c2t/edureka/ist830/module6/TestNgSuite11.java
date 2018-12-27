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

public class TestNgSuite11 {
	@Test
	public void test_first_name(){
		System.out.println("test_first_name");
		long id1 = Thread.currentThread().getId();
		System.out.println("TestNgSuite11/id1="+id1);
	}
	
	@Test
	public void test_last_name(){
		System.out.println("test_last_name");
		long id2 = Thread.currentThread().getId();
		System.out.println("TestNgSuite11/id2="+id2);
	}
}
