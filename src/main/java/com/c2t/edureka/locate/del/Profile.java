package com.c2t.edureka.locate.del;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Profile {

	public static void main(String[] args) {

		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/edureka/locate/Validation.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");

		ProfilesIni pIni = new ProfilesIni();
		FirefoxProfile profile = pIni.getProfile("java");
		
		FirefoxOptions fOptions = new FirefoxOptions();
		fOptions.setProfile(profile);
		
		WebDriver driver = new FirefoxDriver(fOptions);
		
		driver.get(url);
		
	}
}