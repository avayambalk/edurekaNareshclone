package com.c2t.miscellaneous;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.Date;

public class ScreenShot2 {

	public static FirefoxDriver driver;

	private static String URL = "https://www.facebook.com/";

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
	}

	@Test
	public void testWindowUsingName1() throws IOException {

		//TakesScreenshot screen = (TakesScreenshot)driver;
		File f = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("d:/facebook.jpg" ));

	}
	
	public void takeScreenShot(){
		
	}

}
