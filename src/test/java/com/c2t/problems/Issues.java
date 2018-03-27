package com.c2t.problems;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

import static org.junit.Assert.*;

public class Issues {

	private static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://demos.telerik.com/kendo-ui/dropdownlist/index");
		driver.manage().window().maximize();
	}

	@Test
	public void testSimpleAlert() {
		driver.findElement(By.xpath(".//*[@id='cap-view']/span[1]/span/span[2]/span")).click();

		// (ii) Click on the Grey Option by using the XPath as:
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(".//*[@id='color_listbox']/li[3]")).click();
		System.out.println("Grey Selected");
	}

}
