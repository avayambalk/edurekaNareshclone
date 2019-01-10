package com.c2t.edureka.module11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;


import static org.junit.Assert.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AutoITTestChromeWorking {

	private static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/chromedriver_win32_2.45/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://jkorpela.fi/forms/file.html");
		//driver.manage().window().maximize();
	}
	
	

	@Test
	public void testSimpleAlert() {
		// Click Simple button to show an Alert box
		WebElement we = driver.findElement(By.name("datafile"));
		System.out.println(we);
		we.click();
		
		try {
			Runtime.getRuntime().exec("D:/nchaurasia/Automation-Architect/AutoIT/FileUpload_10-01-2019.exe");
		} catch (Exception e) {
			// TODO: handle exception
		}

		
	}


	@AfterClass
	public static void tearDown() {
		//driver.quit();
	}
}
