package com.c2t.wait.explicit;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {

	@Test
	public void explicitWait1() {

		WebDriver driver = new FirefoxDriver();
		long lStartTime = 0;
		long lEndTime = 0;
		long difference = 0;
		
		//org.openqa.selenium.support.ui.ExpectedConditions
		//elementToBeClickable(WebElement element)
		//titleContains
		//visibilityOf

		try {

			lStartTime = new Date().getTime();
			String baseUrl = "file:///D:/nchaurasia/solution-architect/Selenium2.0/c2t-SeleniumWebDriver2.x/htmls/first.html";
			driver.get(baseUrl);
			
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("theButton"))));

			/*WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(driver
					.findElement(By.name("theButton"))));*/

			lEndTime = new Date().getTime();
			difference = lEndTime - lStartTime;

			driver.findElement(By.name("theButton")).click();
			driver.switchTo().alert().accept();

			System.out.println(difference);

		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.close();
		System.exit(0);
	}
}
