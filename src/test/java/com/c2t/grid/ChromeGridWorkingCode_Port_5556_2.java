package com.c2t.grid;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.http.impl.cookie.BasicSecureHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ChromeGridWorkingCode_Port_5556_2 {

	public static WebDriver driver;
	static String baseUrl;
	static String nodeUrl;

	@BeforeClass
	public static void setUp() throws MalformedURLException {

		baseUrl = "https://www.facebook.com/";
		nodeUrl = "http://localhost:5555/wd/hub";
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WIN10);
		
		URL url = new URL(nodeUrl);
		driver = new RemoteWebDriver(url,capabilities);
		
		driver.get(baseUrl);
		
		
	}

	@Test
	public void launchBrowser() {
		
	}

}