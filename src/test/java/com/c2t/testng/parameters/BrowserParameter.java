package com.c2t.testng.parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserParameter {
	WebDriver driver;
	
	
	@Parameters({"browserType"})
	@BeforeClass
	public void before(String browser) {
		System.out.println("browser:"+browser);
		
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}else{
			System.setProperty("webdriver.chrome.driver", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
	}

	@Test
	public void prameterTestOne() {
		driver.get("https://google.com");
		
	}


}