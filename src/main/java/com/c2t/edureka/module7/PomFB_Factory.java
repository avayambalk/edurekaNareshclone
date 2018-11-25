package com.c2t.edureka.module7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class PomFB_Factory {

	WebDriver d;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	List <WebElement> password;
	
	@FindBy(id="u_0_2")
	WebElement logIn;
	
	
	
	PomFB_Factory(WebDriver driver){
		d = driver;
		PageFactory.initElements(d, this);
	}
	
	
	public void sendTextToEmail(){
		email.sendKeys("email id..");
	}
	
	public void sendTextToPass(){
		System.out.println(password.get(0).sendKeys("id"););
		
	}
	
	public void clickLogin(){
		logIn.click();
	}
	
}
