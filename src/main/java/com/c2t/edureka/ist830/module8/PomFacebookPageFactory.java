package com.c2t.edureka.ist830.module8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class PomFacebookPageFactory {
	
	
	@FindBy(id="mail")
	WebElement mailId;
	
	@FindBy(id="pass")
	WebElement passId;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement login;
	
	PomFacebookPageFactory(WebDriver driver) {
		//driver1 = driver;
		System.out.println("this="+this);
		PageFactory.initElements(driver, this);
	}


	
	public void login(String user, String pwd){
	
		mailId.sendKeys(user);
		passId.sendKeys(pwd);
		login.click();
	
	}
	
	

}
