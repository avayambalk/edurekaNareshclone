package com.c2t.edureka.module8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class FacebookPomPageFactory {

	WebDriver driver;
	
	@FindBy(id="email")
	WebElement emailFb;
	
	@FindBy(id="pass")
	WebElement passFb;
	
	@FindBy(id="loginbutton")
	WebElement buttonFb;
	

	FacebookPomPageFactory(WebDriver driver1 ) {
		System.out.println("this="+this);
		PageFactory.initElements(driver1, this);
	}
	
	public void setEmail(String email){
		//emailFb.sendKeys(email);
		driver.findElement(By.id("email"));
	
	}
	
	public void setPassword(String password){
		passFb.sendKeys(password);
	}
	
	public void clickLogin(){
		buttonFb.click();
	}
	
	public void login(String e, String p){
		setEmail(e);
		setPassword(p);
		clickLogin();
		
	}
	
	

}
