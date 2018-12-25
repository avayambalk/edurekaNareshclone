package com.c2t.edureka.ist830.module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FF_Profile {

	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		
		ProfilesIni profile = new ProfilesIni();
		
		FirefoxProfile ff_profile = profile.getProfile("nazmul");
		
		FirefoxOptions ff_options = new FirefoxOptions();
		ff_options.setProfile(ff_profile);
		
		WebDriver driver = new FirefoxDriver(ff_options);
		
		driver.get(url);
		
		String title = driver.getTitle();
		System.out.println(title);	
				
		
		
	}
}