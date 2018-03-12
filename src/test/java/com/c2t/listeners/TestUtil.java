package com.c2t.listeners;

import org.openqa.selenium.WebDriver;

public class TestUtil {

	static WebDriver driver;

	public static void setDriver(WebDriver wd) {
		driver = wd;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}
