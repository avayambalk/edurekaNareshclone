package com.c2t.flash;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import Flash.FlashObjectWebDriver;

public class Flash {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/chromedriver.exe");

		// Open firefox browser
		ChromeOptions options = new ChromeOptions();

		// Disable extensions and hide infobars
		options.addArguments("--disable-extensions");
		options.addArguments("disable-infobars");

		Map<String, Object> prefs = new HashMap<>();

		// Enable Flash
		prefs.put("profile.default_content_setting_values.plugins", 1);
		prefs.put("profile.content_settings.plugin_whitelist.adobe-flash-player", 1);
		prefs.put("profile.content_settings.exceptions.plugins.*,*.per_resource.adobe-flash-player", 1);

		// Hide save credentials prompt
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(options);

		// Maximize browser
		driver.manage().window().maximize();
		// Under Flash jar file there is separate FlashObjectWebDriver class
		FlashObjectWebDriver flashApp = new FlashObjectWebDriver(driver, "myFlashMovie");
		// Pass the URL of video
		driver.get("http://demo.guru99.com/test/flash-testing.html");
		flashApp.callFlashObject("SetVariable", "/:message", "Flash testing using selenium Webdriver");
		System.out.println(flashApp.callFlashObject("GetVariable", "/:message"));
	}
}
