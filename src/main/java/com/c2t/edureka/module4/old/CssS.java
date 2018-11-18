package com.c2t.edureka.module4.old;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CssS {

	public static void main(String[] args) {

		String url = "http://newtours.demoaut.com/";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get(url);

		WebElement we = driver.findElement(By.cssSelector("div.typeahead__container"));
		
		we.findElement(By.className("trackButton"));

	}
}