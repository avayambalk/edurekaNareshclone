package com.c2t.edureka.module4;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Hover {

	public static void main(String[] args) {

		String url = "http://newtours.demoaut.com/";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get(url);

		WebElement link_home = driver.findElement(By.linkText("Home"));

		// Current backgroud color
		WebElement tr_home = driver.findElement(
				By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr"));
		String bgColor = tr_home.getCssValue("background-color");
		System.out.println("bgColor="+bgColor);

		// Move mouse to change color
		Actions actions = new Actions(driver);
		actions.moveToElement(link_home).build().perform();

		String bgColorNew = tr_home.getCssValue("background-color");
		System.out.println("bgColorNew="+bgColorNew);

	}
}