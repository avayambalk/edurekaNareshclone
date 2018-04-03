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

public class NodeFireFoxTest {

	public static WebDriver driver;
	static String baseUrl;
	static String nodeUrl;

	@BeforeClass
	public static void setUp() throws MalformedURLException {

		baseUrl = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/test/java/com/c2t/frame/ParentFrame.html";
		nodeUrl = "http://localhost:5555/wd/hub";

		DesiredCapabilities capability = DesiredCapabilities.firefox();

		// Information for node.
		capability.setBrowserName("firefox");
		capability.setVersion("45.5.1");
		capability.setPlatform(Platform.WIN10);
		URL url = new URL(nodeUrl);
		driver = new RemoteWebDriver(url, capability);
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get(
				"file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/test/java/com/c2t/frame/ParentFrame.html");
		driver.manage().window().maximize();
	}

	@Test
	public void launchBrowser() {

	}

}