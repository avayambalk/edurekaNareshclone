package com.c2t.shraddha.frames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class NewFrames {
	WebDriver driver;

	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/");
		driver.manage().window().maximize();
	}

	@Test
	public void test1() {
		driver.switchTo().frame("packageListFrame");
		WebElement packages = driver.findElement(By.cssSelector("div.indexContainer>ul"));
		System.out.println(packages.getText());

		driver.findElement(By.linkText("org.openqa.selenium")).click();

		driver.switchTo().defaultContent();

		driver.switchTo().frame("packageFrame");

		List<WebElement> classes = driver.findElements(By.cssSelector("div.indexContainer>ul"));

		for (int i = 0; i < classes.size(); i++) {

			List<WebElement> l = classes.get(i).findElements(By.tagName("li"));
			System.out.println(classes.get(i).getText());
			System.out.println(l.size());
		}
	}
}
