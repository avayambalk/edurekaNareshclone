package com.c2t.profile.ff;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FFProfile {

	public static WebDriver driver;

	private static String URL = "https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=z2qiWoCZDaymX6mrt7AH&gws_rd=ssl";

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		
		ProfilesIni ini = new ProfilesIni();
		FirefoxProfile profile = ini.getProfile("edureka");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		
		driver = new FirefoxDriver(options);
		
		
		
		
		
		/*ProfilesIni ini = new ProfilesIni();
		FirefoxProfile profile = ini.getProfile("SeleniumProfile");
		
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);*/
		
		
		//driver = new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.navigate().to(URL);
	}

	@Test
	public void testWindowUsingName() {
	}

}
