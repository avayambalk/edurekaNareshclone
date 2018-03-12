package com.c2t.listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListenerImpl.class)
public class ITestListenerTc {
	
	/*WebDriver driver;
	
	private static String URL = "https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=UrWLWr7TBaycX_C9l8AC&gws_rd=ssl";
	
	@BeforeTest
	public void starting(){
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		//TestUtil.setDriver(driver);
	}*/

	@Test
	public void testRealReportOne() {

		System.out.println("---testRealReportOne---");
		Assert.assertTrue(true);

	}

}
