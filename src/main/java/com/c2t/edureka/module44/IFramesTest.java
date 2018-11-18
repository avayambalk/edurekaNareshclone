package com.c2t.edureka.module44;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;

public class IFramesTest {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/test/java/com/c2t/iframe/ParentFrame.html");
		driver.manage().window().maximize();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void byName(){
		WebElement we = driver.findElement(By.name("iframe1"));
		System.out.println(we.toString());
		driver.switchTo().frame(we);
		String url = driver.getCurrentUrl();
		String text = driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/header/h1")).getText();
		System.out.println("url="+url);
		System.out.println("text="+text);
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
			
/*	@Test
	public void testIFrame() {
		// Store the handle of current driver window
		String currentWindow = driver.getWindowHandle();
		
		// The frame on the right side has a nested iframe containing 'Twitter
		// Follow' Button
		// Activate the frame on right side using it's name attribute
		try {
			driver.switchTo().frame("right");

			// Get the iframe element
			WebElement twitterFrame = driver.findElement(By.tagName("iframe"));

			try {
				// Activate the iframe
				driver.switchTo().frame(twitterFrame);
				// Get and Click the follow button from iframe
				// a Popup Window will appear after click
				WebElement button = driver.findElement(By.id("follow-button"));
				button.click();

				try {
					// The Twitter Popup does not have name or title.
					// Script will get handles of all open windows and
					// desired window will be activated by checking it's Title

					for (String windowId : driver.getWindowHandles()) {
						driver.switchTo().window(windowId);
						if (driver.getTitle().equals(
								"Unmesh Gundecha (@upgundecha) on Twitter")) {
							assertTrue("Twitter Login Popup Window Found", true);
							driver.close();
							break;
						}

					}
				} finally {
					// Switch back to original driver window
					driver.switchTo().window(currentWindow);
				}
			} finally {
				// switch back to Page from the frame
				driver.switchTo().defaultContent();
			}

		} finally {
			// switch back to Page from the frame
			driver.switchTo().defaultContent();
		}
	}

	@AfterClass
	public static void tearDown() {
		// Close the Parent Popup Window
		driver.close();
		driver.quit();
	}
*/}
