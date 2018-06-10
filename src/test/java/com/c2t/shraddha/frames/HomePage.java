package com.c2t.shraddha.frames;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public static WebDriver driver;

	public HomePage(WebDriver passedDriver) {
		driver = passedDriver;
	}

	public void clickOnButton(String buttonName) {
		List<WebElement> buttons = driver.findElements(By.cssSelector("button.btn.btn-info"));
		for (WebElement webElement : buttons) {
			if (webElement.getText().equals(buttonName)) {
				webElement.click();
				break;
			}

		}
	}

	/*
	 * public enum ButtonName{
	 * 
	 * Freames, Images, iFrame, Waits, POM }
	 */

}