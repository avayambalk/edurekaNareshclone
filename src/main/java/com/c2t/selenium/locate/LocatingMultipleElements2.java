package com.c2t.selenium.locate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.c2t.util.SeleniumUtil;

public class LocatingMultipleElements2 {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/selenium/locate/LocatingMultipleElements.html");
		
		List<WebElement> we =driver.findElements(By.name("gender"));
		
		for(int i=0;i<we.size();i++){
			if(i==1){
				we.get(i).click();
			}
		}
		
	}
}
