package com.c2t.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPOM2 {

	WebDriver driver;
	
	By byEmail  = By.id("email");
	By byPassword = By.id("pass");

	LoginPOM2(WebDriver d) {
		driver = d;
	}

	public void setEmail(String email) {
		WebElement we = driver.findElement(byEmail);
		we.sendKeys(email);
	}

	public void setPassword(String password) {
		WebElement we = driver.findElement(byPassword);
		we.sendKeys(password);
	}

	public void clickLogin() {

		driver.findElement(By.id("loginbutton")).click();

	}

}