package com.c2t.framework.ddt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class TestNGDDT {

	private WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();
		driver.get("http://cookbook.seleniumacademy.com/bmicalculator.html");

	}

	/*
	 * Mark a method as supplying data for a test method. The data provider name
	 * defaults to method name. The annotated method must return an Object[][]
	 * where each Object[] can be assigned the parameter list of the test
	 * method. The @Test method that wants to receive data from this
	 * DataProvider needs to use a dataProvider name equals to the name of this
	 * annotation.
	 */
	@DataProvider
	public String[][] testData() {
		
		String data [][] = new String[][] {
			
			{ "AA", "BB", "CC", "India" }, 
			
			{ "165", "50", "18.4", "Underweight" },
				
			{ "170", "50", "17.3", "Underweight" }
			
		};
		
		return data;
	}


	@Test(dataProvider="testData")
	public void testBMICalculator(String Name, String Email, String Password, String country) {
		Select s = new Select(driver.findElement(By.id("country")));
		s.selectByValue(country);
	}

}
