package com.c2t.testng.assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAssertions2 {

	@Test
	public void assert4() {
		String expectedValue = "v1";
		String actualValue = "v2";
		Assert.assertEquals(actualValue, expectedValue,"The values are not equal...");
	
	}
}
