package com.c2t.ist830;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;

import java.util.List;

public class Frames {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(
				"file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/test/java/com/c2t/frame/ParentFrame.html");
		driver.manage().window().maximize();
	}


	@Test
	public void testFrameWithIdOrName() {

		driver.switchTo().frame("top");
		
		String sourceTop = driver.getPageSource();
		System.out.println(sourceTop);
		
		driver.switchTo().defaultContent();
		System.out.println(driver.getPageSource());
		
		driver.switchTo().frame("bottom");
		
	}

	@Test
	public void testFrameByIndex() {
		// Activate the frame in middle using it's index. Index starts at 0
		driver.switchTo().frame(0);

		String sourceTop = driver.getPageSource();
		System.out.println(sourceTop);
	}

	@Test
	public void testFrameByContents() {

		// Get all frames on the Page, created with <frame> tag
		List<WebElement> frames = driver.findElements(By.tagName("frame"));

		for (WebElement frame : frames) {
			// switchTo().frame() also accepts frame elements apart from id,
			// name or index
			driver.switchTo().frame(frame);
			String title = driver.getTitle();
			if (title.equals("Frame B")) {
				driver.findElement(By.tagName("p"));
				break;
			} else
				driver.switchTo().defaultContent();
		}
	}

	}
