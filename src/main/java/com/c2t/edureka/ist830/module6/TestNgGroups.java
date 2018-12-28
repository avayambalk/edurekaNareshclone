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

public class TestNgGroups {

	@Test(groups={"sanity"})
	public void test_first_name(){
		System.out.println("1.test_first_name");
	}
	
	@Test(groups={"regression"})
	public void test_last_name(){
		System.out.println("1.test_last_name");
	}
	
	@Test(groups={"sanity","regression"},enabled=false)
	public void test_middle_name(){
		System.out.println("1.test_middle_name");
	}

}
