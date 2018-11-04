package com.c2t.pom;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.c2t.pom.MyPOM;

public class FBLoginTestPageFactory {

	WebDriver driver;
	LoginPOM3 pom;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		pom = new LoginPOM3(driver);
	}

	@Test
	public void loginTest() {
		pom.setEmail("");
		pom.setPassword("");
		pom.clickLogin();
	}

}
