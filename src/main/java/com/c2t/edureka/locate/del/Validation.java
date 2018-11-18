package com.c2t.edureka.locate.del;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validation {

	public static void main(String[] args) {

		String url = "https://www.facebook.com/";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get(url);

		String title = driver.getTitle();
		
		if(title.equals("Facebook – log in or sign up")){
			System.out.println("The correct page has loaded...");
		}else{
			System.out.println("It is not face book page");
		}
		
		
	}
}