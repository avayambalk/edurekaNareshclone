package com.c2t.autoit;

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

public class AutoITTestFF {

	private static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://jkorpela.fi/forms/file.html");
	}
	
	

	@Test
	public void testSimpleAlert() {
		// Click Simple button to show an Alert box
		WebElement we = driver.findElement(By.name("datafile"));
		System.out.println(we);
		we.click();
		
		
		try {
			Runtime.getRuntime().exec("D:/nchaurasia/Automation-Architect/AutoIT/FileUploadSelenium.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	@AfterClass
	public static void tearDown() {
		//driver.quit();
	}
}
