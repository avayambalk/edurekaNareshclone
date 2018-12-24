package com.c2t.edureka.casestudy4;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.NullPointerException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.remote.ProtocolHandshake;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class TestNGCaseStudy {
	WebDriver driver;

	@BeforeClass()
	public void SetUp() {
		System.setProperty("webdriver.firefox.marionette",
				"D:/nchaurasia/Automation-Architect/JavaSeleniumEdureka/driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

	}

	@Test()
	public void verifypagetitle() {

		String Title = driver.getTitle();
		System.out.println("The page title=" + Title);
		Assert.assertEquals(Title, "Google");

	}

	@Test()
	public void Login() {
		String URL = ("https://www.google.com/");
		driver.get(URL);
		driver.navigate().to("https://www.edureka.co/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement signin = driver.findElement(By.xpath(".//*[@id='header-II']/section/nav/div/a[2]"));
		signin.click();
		WebElement Inputemail = driver.findElement(By.id("si_popup_email"));
		Inputemail.sendKeys("anusha.mavilla@gmail.com");
		WebElement EnterPassword = driver.findElement(By.id("si_popup_passwd"));
		EnterPassword.sendKeys("*********");/* Hiding the password */
		WebElement login = driver
				.findElement(By.xpath(".//*[@id='new_sign_up_mode']/div/div/div[2]/div[3]/form/button"));
		login.click();
		WebElement we = driver.findElement(By.id("homeSearchBar"));
		we.sendKeys("DevOps");
		we.submit();
	}

	@AfterClass()
	public void logout() {
		System.out.println("Closing the Browser");
		driver.quit();
	}
}