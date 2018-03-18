package com.c2t.testng.fblogin;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.c2t.listeners.TestUtil;

@Listeners(FBListener.class)
public class FBLogin {
	
	public static WebDriver driver;

	private static String URL = "https://www.facebook.com/";


	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		TestUtil.setDriver(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.navigate().to(URL);

	}
	
	@Test(priority=-1)
	public void verifyPageTitle() {
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle,"The tiles are not equal..");
	}

	@Test(priority=1)
	public void setEmail() {
		driver.findElement(By.id("email")).sendKeys("message4naresh@gmail.com");
	}

	@Test(priority=2)
	public void setPassword() {
		driver.findElement(By.id("pass")).sendKeys("dummy");;
	}
	
	@Test(priority=3)
	public void clickLogin(){
		driver.findElement(By.id("loginbutton")).click();
	}
	
	@Test(priority=4)
	public void validate(){
		
		takeScreenShot();
		
		
		
		String expectedValue = "Sign up for Facebook";
		
		String actualValue = driver.findElement(By.id("reg-link")).getText();
		
		Assert.assertEquals(actualValue, expectedValue,"The values are not equal...");
	}
	
	public void takeScreenShot(){

		// TODO Auto-generated method stub

			File screenShot = ((TakesScreenshot) driver).getScreenshotAs((OutputType.FILE));

			long time = new Date().getTime();

			try {
				FileUtils.copyFile(screenShot, new File("d:/screen-" + time + ".jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	

}
