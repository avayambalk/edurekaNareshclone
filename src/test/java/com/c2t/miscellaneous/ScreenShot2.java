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

	public static WebDriver driver;

	private static String URL = "https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=UrWLWr7TBaycX_C9l8AC&gws_rd=ssl";

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
	}

	@Test
	public void testWindowUsingName1() throws IOException {

		TakesScreenshot screen = (TakesScreenshot)driver;
		File f = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("d:/screenshot.jpg"));

	}

}
