package com.c2t.testng.fblogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
		
		
		
		String expectedValue = "Sign up for Facebook";
		
		String actualValue = driver.findElement(By.id("reg-link")).getText();
		
		Assert.assertEquals(actualValue, expectedValue,"The values are not equal...");
	}
	
	

}
