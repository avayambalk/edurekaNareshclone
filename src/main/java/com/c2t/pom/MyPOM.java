package com.c2t.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyPOM {
	
	
	
	@FindBy(id="email")
	WebElement element1;

	WebDriver driver;
	
	public MyPOM(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void sendKeyToEmail(String email){
	
		element1.sendKeys(email);
	}
	
	public void sendKeyToPassword(String pass){
		WebElement we2 =driver.findElement(By.id("pass"));
		we2.sendKeys(pass);
	}
	
	public void clickLogin(){
		WebElement we3 =driver.findElement(By.id("loginbutton"));
		we3.click();
	}
	
	public void login(String email, String password){
		sendKeyToEmail(email);
		sendKeyToPassword(password);
		clickLogin();
	}
	
	
}
