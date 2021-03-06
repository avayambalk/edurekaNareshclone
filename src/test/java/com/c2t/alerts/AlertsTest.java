package com.c2t.alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class AlertsTest {

	private static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.get("http://cookbook.seleniumacademy.com/Alerts.html");
		driver.get("file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/Alert.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void t1() {
		
	}
	
	@Test
	public void testSimpleAlert() {
		// Click Simple button to show an Alert box
		driver.findElement(By.id("simple")).click();
		
		TargetLocator target = driver.switchTo();
		Alert al = target.alert();
	
		// Optionally we can also wait for an Alert box using the WebDriverWait
		/*new WebDriverWait(driver, 10)
				.until(ExpectedConditions.alertIsPresent());*/
		
		// Get the Alert
		Alert alert = driver.switchTo().alert();

		// Get the text displayed on Alert
		String textOnAlert = alert.getText();

		// Check correct message is displayed to the user on Alert box
		Assert.assertEquals("Hello! I am an alert box!", textOnAlert);

		// Click OK button, by calling accept method
		alert.accept();
	}

	@Test
	public void testConfirmAccept() {
		// Click Confirm button to show Confirmation Alert box
		driver.findElement(By.id("confirm")).click();

		// Get the Alert
		Alert alert = driver.switchTo().alert();

		// Click OK button, by calling accept method
		//alert.accept();
		alert.dismiss();

		// Check Page displays correct message
		WebElement message = driver.findElement(By.id("demo"));
		Assert.assertEquals("You Accepted Alert!", message.getText());
	}

	@Test
	public void testConfirmDismiss() {
		// Click Confirm button to show Confirmation Alert box
		driver.findElement(By.id("confirm")).click();

		// Get the Alert
		Alert alert = driver.switchTo().alert();

		// Click Cancel button, by calling dismiss method
		alert.dismiss();

		// Check Page displays correct message
		WebElement message = driver.findElement(By.id("demo"));
		Assert.assertEquals("You Dismissed Alert!", message.getText());
	}

	@Test
	public void testPrompt() {
		// Click Confirm button to show Prompt Alert box
		driver.findElement(By.id("prompt")).click();

		// Get the Alert
		Alert alert = driver.switchTo().alert();

		// Enter some value on Prompt Alert box
		alert.sendKeys("Foo");

		// Click OK button, by calling accept method
		alert.accept();

		// Check Page displays message with value entered in Prompt
		WebElement message = driver.findElement(By.id("prompt_demo"));
		Assert.assertEquals("Hello Foo! How are you today?", message.getText());
	}

	@AfterClass
	public static void tearDown() {
		//driver.quit();
	}
}
