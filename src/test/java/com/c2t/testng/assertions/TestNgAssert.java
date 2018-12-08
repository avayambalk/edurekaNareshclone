package com.c2t.testng.assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAssert {
	
	@Test
	public void test1(){

		String expected = "hello";
		String actual = "hello";
		
		Assert.assertEquals(actual, expected,"the 2 values are not equal...");
	
	}
}
