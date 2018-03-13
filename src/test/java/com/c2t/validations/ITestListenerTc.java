package com.c2t.validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class ITestListenerTc {
	
	WebDriver driver;
	
	private static String URL = "http://localhost:8888/c2t-WebApp1/users";
	
	@BeforeTest
	public void starting(){
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
	}

	@Test
	public void validateTitle() {


		String excpectedTitle = "Spring MVC Form Handling Example";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, excpectedTitle,"Expected and Actual Title are not same...");
		
	}
	
	@Test
	public void validatUsingTest() {

		String textInBody = "All Users";
		
		String s = driver.getPageSource();
		
		System.out.println(s);
		
		boolean bool = s.contains(textInBody);
		Assert.assertTrue(bool);
		
	}
	
	
	@Test
	public void validatUsingXpath() {
		
		String excpected = "All Users";

		WebElement we = driver.findElement(By.xpath("html/body/div[1]/h1"));
		String actual = we.getText();

		
		Assert.assertEquals(actual, excpected,"Expected and Actual Title are not same...");
		
		
	}

}
