package com.c2t.edureka.module8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class FacebookPom {

	WebDriver driver;
	
	By byEmail = By.id("email");
	By byPassword = By.id("pass");
	By byButton = By.id("u_0_8");
	
	FacebookPom(WebDriver driver1 ) {
		driver = driver1;
	}
	
	public void setEmail(String email){
		WebElement we  = driver.findElement(byEmail);
		we.sendKeys(email);
	
	}
	
	public void setPassword(String password){
		WebElement we = driver.findElement(byPassword);
		we.sendKeys(password);
	}
	
	public void clickLogin(){
		WebElement we = driver.findElement(byButton);
		we.click();
	}
	
	

}
