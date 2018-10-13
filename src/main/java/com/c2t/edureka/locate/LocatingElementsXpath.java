package com.c2t.edureka.locate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingElementsXpath {

	public static void main(String[] args) {

		String url = "https://www.facebook.com/";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get(url);

		//WebElement we = driver.findElement(By.xpath("//label[contains(text(), 'Email or Phone')]"));
		//System.out.println(we);
		
		//WebElement elementEmail = driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		//elementEmail.sendKeys("message4naresh@gmail.com");
		
		/*WebElement weStartsWith = driver.findElement(By.xpath("//div[starts-with(text(), 'Facebook helps you')]"));
		String s = weStartsWith.getText();
		System.out.println(s);*/
		
		WebElement we = 
				driver.findElement(By.xpath("//input[contains(@id,'email')]/following::input[1]"));
		we.sendKeys("password");
	}
}