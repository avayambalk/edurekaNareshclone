package com.c2t.pom;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.c2t.pom.Guru99HomePage;
import com.c2t.pom.LoginPOM;

public class Test99GuruLogin2 {
	WebDriver driver;
	LoginPOM2 pom;
	

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		pom = new LoginPOM2(driver);
		
	}
	
	
	@Test(priority = 0)
	public void verifyTitle() {
		
		String expectedTitle =  "Facebook � log in or sign up";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
	
	}
		
	
	@Test(priority = 1)
	public void login() {
		pom.setEmail("email");
		pom.setPassword("password");
		pom.clickLogin();
	}
	
	
}