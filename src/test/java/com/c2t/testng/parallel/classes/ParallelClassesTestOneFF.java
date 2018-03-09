package com.c2t.testng.parallel.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelClassesTestOneFF {
	
	
	public static WebDriver driver;

	private static String URL = "https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=UrWLWr7TBaycX_C9l8AC&gws_rd=ssl";

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
	}
	
	
	@AfterClass
	public void afterClass() {
		long id = Thread.currentThread().getId();
		System.out.println("after ParallelClassesTestOne:....................................... " + id);
	}

	@Test
	public void testMethodOne1() {
		long id = Thread.currentThread().getId();
		System.out.println("ParallelClassesTestOne testMethodOne1:....................................... " + id);
	}

	@Test
	public void testMethodOne2() {
		long id = Thread.currentThread().getId();
		System.out.println("ParallelClassesTestOne testMethodOne2:....................................... " + id);
	}

	
}