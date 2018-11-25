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
import org.testng.annotations.DataProvider;
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

public class DataProviderTestNG {

	@DataProvider
	public String[][] data() {

		String matrix[][] = { { "a", "b", "aa" }, { "c", "d", "bb" } };
		
		return matrix;
	}

	@Test(dataProvider="data")
	public void test1(String s1, String s2, String s3) {

		System.out.println("s1=" + s1);
		System.out.println("s2=" + s2);
		System.out.println("s3=" + s3);
	}
}
