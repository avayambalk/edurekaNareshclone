package com.c2t.edureka.ist830.module11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
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

public class SikuliDemo {

	private static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	}
	
	

	@Test
	public void testSimpleAlert() {
		//driver.findElement(By.id("fileToUpload")).click();
		Pattern p1 = new Pattern("D:/nchaurasia/Automation-Architect/img/TextBox-08.01.2019.jpg");
		Pattern p2 = new Pattern("D:/nchaurasia/Automation-Architect/img/Save-08.01.2019.jpg");
		Pattern p3 = new Pattern("D:/nchaurasia/Automation-Architect/img/DownArrow-08.01.2019.jpg");
		
		Pattern fb = new Pattern("D:/nchaurasia/Automation-Architect/img/FB-Email-08.01.2019.jpg");
		
		
		
		Screen screen = new Screen();
		
		try {
			//screen.wait(p1,5);
			//screen.type(p1,"python.txt");
			//screen.click(p2);
			//screen.click(p3);
			
			screen.wait(fb,5);
			screen.type(fb, "mail-id");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}


	@AfterClass
	public static void tearDown() {
		//driver.quit();
	}
}
