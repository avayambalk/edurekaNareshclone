package com.c2t.selenium.locate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.c2t.util.SeleniumUtil;

public class LocatingMultipleElements {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String resourceDir = SeleniumUtil.getRootDir() + "/src/main/java/com/c2t/selenium/locate/LocatingMultipleElements.html";
		driver.get(resourceDir);
		
		// locates elements by the value of their "id" attribute
		String id = driver.findElement(By.id("fname")).getTagName();
		System.out.println(id);
		
		Select dropdown = new Select(driver.findElement(By.id("designation")));
		dropdown.selectByVisibleText("Programmer");

		Select dropdown2 = new Select(driver.findElement(By.id("designation")));
		dropdown2.selectByIndex(2);

		Select dropdown3 = new Select(driver.findElement(By.id("designation")));
		dropdown3.selectByValue("CEO");
		

		List<WebElement> we = driver.findElements(By.name("gender"));
		boolean isSelected = false;
		isSelected = we.get(0).isSelected();
		System.out.println("isSelected-------------------------------->"
				+ isSelected);
		if (isSelected) {
			we.get(1).click();
		} else {
			we.get(0).click();
		}
	

	}
}
