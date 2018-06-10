package com.c2t.shraddha.frames;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {

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
	public void test1(){
		driver.switchTo().frame("packageListFrame");
		WebElement packages = driver.findElement(By.cssSelector("div.indexContainer>ul"));
		List l =  packages.findElements(By.tagName("li"));
		System.out.println(l.size());
	}

	@Parameters({ "Button", "PackageName", "FilePath", "BottomFrameValue" })
	@Test
	public void Use_Case_Frames(String button, String packageName, String filePath, String bottomFrameValue) {
		HomePage homePage = new HomePage(driver);
		try {
			// Visit the home page and click on Frames button
			homePage.clickOnButton(button);

			// Find out the number of Packages available in the screen.
			FramesClass frames = new FramesClass(driver);
			frames.WritePackageNameIntoExcel(filePath, packageName);

			// Click on the Package
			frames.clickOnPackage(packageName);

			// Find out the number of Interfaces, classes, Exceptions on this
			// package from bottom left

			frames.WritePackageDetailsIntoExcel(filePath, packageName);

			// Click on WebDriver interface
			Assert.assertTrue(frames.clickOnElement_BottomLeftFrame(bottomFrameValue), "Clicked on value");

			// Find out all the Implementing Classes in the WebDriver interface
			Assert.assertTrue(frames.WriteImplementingClassesOrInterfacesIntoExcel(filePath, packageName),
					"successful");
			
			// Find out All Methods in the WebDriver interface
			Assert.assertTrue(frames.WriteMethodsIntoExcel(filePath, packageName), "success");
			
			// close
			driver.switchTo().defaultContent();
			driver.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
	}
}