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

		//WebElement we = driver.findElement(By.xpath("//label[contains(text(),'Email or Phone')]"));
		
		//driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("email");
		
		//String text = driver.findElement(By.xpath("//div[starts-with(text(),'Facebook helps you')]")).getText();
		//System.out.println("text="+text);
		
		//Following axes
		driver.findElement(By.xpath(".//*[@id='email']/following::td[1]/input")).sendKeys("Password");
		
		//.//*[@id='day']/following-sibling::select/option[1]

	}
}