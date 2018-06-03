package com.c2t.urbanpro;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UrbanPro {

	WebDriver driver;

	@BeforeClass
	public void openBrower() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.urbanpro.com/login");
		// driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void login() {
		WebElement we = driver.findElement(By.id("j_username"));
		we.sendKeys("message4naresh@gmail.com");

		WebElement we2 = driver.findElement(By.cssSelector(".newBtn.blueBtn.loginNxt.mt-10"));
		we2.click();

		WebElement we3 = driver.findElement(By.id("j_password"));
		we3.sendKeys("UrbanPro12#$");

		WebElement we4 = driver.findElement(By.cssSelector(".newBtn.blueBtn.mt-15.submitBtn.recaptchSubmit"));
		we4.click();
	}

	@Test(priority = 1)
	public void skip() {
		WebElement we = driver.findElement(By.linkText("Skip"));
		we.click();
	}

	@Test(priority = 2)
	public void contacted() {
		List<WebElement> elements = driver.findElements(By.cssSelector(".inline-block.paddingTop8"));

		for (int i = 0; i < elements.size(); i++) {
			String text = elements.get(i).getText();
			System.out.println("text=" + text);

			if (text != null && text.equals("Contacted")) {
				elements.get(i).click();
			}
		}
	}
}
