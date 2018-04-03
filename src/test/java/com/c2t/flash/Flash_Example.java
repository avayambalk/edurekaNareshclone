package com.c2t.flash;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

class FlashWebDriver {
	private final WebDriver webdriver;
	private final String flashObjectId;

	public FlashWebDriver(final WebDriver webdriver, final String flashObjectId) {
		this.webdriver = webdriver;
		this.flashObjectId = flashObjectId;
	}

	public String click(final String objectId, final String buttonLabel) {
		return callFlashObject("DoFlashClick", objectId, buttonLabel);
	}

	public String click(final String objectId) {
		return callFlashObject(objectId, "");
	}

	public String callFlashObject(final String functionName, final String... args) {
		final Object result = ((JavascriptExecutor) webdriver).executeScript(makeJsFuntion(functionName, args),
				new Object[0]);
		return result != null ? result.toString() : null;
	}

	private String makeJsFuntion(final String functionName, final String... args) {

		final StringBuffer functionArgs = new StringBuffer();
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				if (i > 0) {
					functionArgs.append(",");
				}
				functionArgs.append(String.format("'%1$s'", args[i]));
			}
		}
		return String.format("return document.%1$s.%2$s(%3$s);", flashObjectId, functionName, functionArgs);
	}
}

public class Flash_Example

{
	public static void main(String[] args) throws Throwable {
		
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
		System.setProperty("webdriver.chrome.driver", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/chromedriver.exe");


		driver.manage().window().maximize();

		FlashWebDriver flashapp = new FlashWebDriver(driver, "myFlashMovie");

		driver.get("http://www.permadi.com/tutorial/flashjscommand/");

		flashapp.callFlashObject("Play");

		Thread.sleep(3000);

		flashapp.callFlashObject("StopPlay");

	}
}