package com.c2t.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM3 {

	WebDriver driver;
	
	@FindBy(id="email")
	WebElement we1;
	
	@FindBy(id="pass")
	WebElement we2;
	

	LoginPOM3(WebDriver d) {
		System.out.println("this="+this);
		driver = d;
		PageFactory.initElements(driver, this);
	}

	public void setEmail(String email) {
		we1.sendKeys(email);
	}

	public void setPassword(String password) {
		we2.sendKeys(password);
	}

	public void clickLogin() {

		driver.findElement(By.id("loginbutton")).click();

	}

}