package in.connect2tech.pom;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import in.connect2tech.pom.Guru99HomePage;
import in.connect2tech.pom.Guru99Login;

public class Test99GuruLogin2 {
	WebDriver driver;
	Guru99Login objLogin;
	Guru99HomePage objHomePage;
	
	Map m = new HashMap();

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
		objLogin = new Guru99Login(driver);
		
		//fuction to read error messages.
	}
	
	
	@Test(priority = -1)
	public void clearTextBoxes() {
		//objLogin.setFieldValues("Lavanya", "password");
		objLogin.resetIdPassword();
		
		//verification
		String valUserId = objLogin.fetchUserIdValue();
		Assert.assertEquals("", valUserId);
	
	}
		
	/**
	 * This test case will login in http://demo.guru99.com/V4/ Verify login page
	 * title as guru99 bank Login to application Verify the home page using
	 * Dashboard message
	 */
	@Test(priority = 0)
	public void test_Home_Page_Appear_Correct() {
		// Create Login Page object
		
		// Verify login page title
		String loginPageTitle = objLogin.getLoginTitle();
		Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
		// login to application
		objLogin.loginToGuru99("mngr98666", "anahEpy");
		// go the next page
		objHomePage = new Guru99HomePage(driver);
		// Verify home page
		Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("Manger Id : mngr98666"));
	}
	
	
}