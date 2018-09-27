package com.c2t.pom;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.c2t.pom.Guru99HomePage;
import com.c2t.pom.LoginPOM;

public class Test99GuruLogin {
	WebDriver driver;
	LoginPOM objLogin;
	Guru99HomePage objHomePage;
	

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
		objLogin = new LoginPOM(driver);
		
		//fuction to read error messages.
	}
	
	@Test(priority = -2)
	public void login(){
		objLogin.loginToGuru99("abc", "def");
	}
	
	
	/*@Test(priority = -1, enabled=false)
	public void clearTextBoxes() {
		//objLogin.setFieldValues("Lavanya", "password");
		objLogin.resetIdPassword();
		
		//verification
		String valUserId = objLogin.fetchUserIdValue();
		Assert.assertEquals("", valUserId);
	
	}*/
		
	/**
	 * This test case will login in http://demo.guru99.com/V4/ Verify login page
	 * title as guru99 bank Login to application Verify the home page using
	 * Dashboard message
	 */
	@Test(priority = 0, enabled=true)
	public void test_Home_Page_Appear_Correct() {
		// Create Login Page object
		
		// Verify login page title
		String loginPageTitle = objLogin.getLoginTitle();
		Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
		// login to application
		objLogin.loginToGuru99("mngr145670", "sadAbEr");
		// go the next page
		objHomePage = new Guru99HomePage(driver);
		// Verify home page
		Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("Manger Id : mngr98666"));
	}
	
	@Test(priority = 1, enabled=false)
	public void test_Err_Msg_UserName() {
		String errUserName = objLogin.getUserNameErrorMsgs();
		Assert.assertEquals(errUserName, "Error Msg");
	}
	
	public void fetchDataFromExcel(){
		
	}
}