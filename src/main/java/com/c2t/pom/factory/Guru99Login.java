package com.c2t.pom.factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99Login {
	/**
	 * All WebElements are identified by @FindBy annotation
	 */
	
	
	/*By user99GuruName = By.name("uid");
	By password99Guru = By.name("password");
	By titleText = By.className("barone");
	By login = By.name("btnLogin");*/
	
	WebDriver driver;

	@FindBy (name = "uid")
	WebElement user99GuruName;

	@FindBy(name = "password")
	WebElement password99Guru;

	@FindBy(className = "barone")
	WebElement titleText;

	@FindBy(name = "btnLogin")
	WebElement login;
	
	@FindBy(tagName = "img")
	WebElement image;
	
	
	
	public Guru99Login(WebDriver driver1) {
		driver = driver1;
		// This initElements method will create all WebElements
		System.out.println("this="+this);
		PageFactory.initElements(driver, this);
	}
	
	/*public void loginGuru99(){
		user99GuruName.sendKeys("userid");
		password99Guru.sendKeys("password");
		login.cl
	}*/

	// Set user name in textbox
	public void setUserName(String strUserName) {
		user99GuruName.sendKeys(strUserName);

	}

	// Set password in password textbox
	public void setPassword(String strPassword) {
		password99Guru.sendKeys(strPassword);
	}

	// Click on login button
	public void clickLogin() {
		login.click();
	}

	// Get the title of Login Page
	public String getLoginTitle() {
		return titleText.getText();
	}

	/**
	 * This POM method will be exposed in test case to login in the application
	 * 
	 * @param strUserName
	 * @param strPasword
	 * @return
	 */
	public void loginToGuru99(String strUserName, String strPasword) {
		// Fill user name
		this.setUserName(strUserName);
		// Fill password
		this.setPassword(strPasword);
		// Click Login button
		this.clickLogin();

	}
}
