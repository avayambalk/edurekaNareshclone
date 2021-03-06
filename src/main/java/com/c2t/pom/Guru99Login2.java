package com.c2t.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99Login2 {
	WebDriver driver;
	By user99GuruName = By.name("uid1");
	By password99Guru = By.name("password");
	By titleText = By.className("barone");
	By login = By.name("btnLogin");

	public Guru99Login2(WebDriver driver) {
		this.driver = driver;
	}

	// Set user name in textbox
	public void setUserName(String strUserName) {
		driver.findElement(user99GuruName).sendKeys(strUserName);
	}
	
	public String getUserNameErrorMsgs() {
		return "User Cannot be blank";
	}

	// Set password in password textbox
	public void setPassword(String strPassword) {
		driver.findElement(password99Guru).sendKeys(strPassword);
	}

	// Click on login button
	public void clickLogin() {
		driver.findElement(login).click();
	}

	// Get the title of Login Page
	public String getLoginTitle() {
		return driver.findElement(titleText).getText();
	}
	
	public void clearId(){
		driver.findElement(user99GuruName).clear();
	}
	
	public void clearPassword(){
		driver.findElement(password99Guru).clear();
	}
	
	public String fetchUserIdValue(){
		
		String val = driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).getText();
		if(val == null || val.length() == 0)
		{
			val = "";
		}
			
		return val;
	}

	/**
	 * 
	 * This POM method will be exposed in test case to login in the application
	 * 
	 * @param strUserName
	 * 
	 * @param strPasword
	 * 
	 * @return
	 * 
	 */
	public void loginToGuru99(String strUserName, String strPasword) {
		// Fill user name
		this.setUserName(strUserName);
		// Fill password
		this.setPassword(strPasword);
		// Click Login button
		this.clickLogin();
	}
	
	public void setFieldValues(String strUserName, String strPasword){
		this.setUserName(strUserName);
		this.setPassword(strPasword);
	}
	
	public void resetIdPassword(){
		this.clearId();
		this.clearPassword();
	}
	
	
}