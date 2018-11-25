package com.c2t.edureka.module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class PomFB {

	WebDriver d;
	
	PomFB(WebDriver driver){
		d = driver;
	}
	
	
	public void findEmail(){
		d.findElement(By.id("email")).sendKeys("mail id");
	}
	
	public void findPassword(){
		d.findElement(By.id("pass")).sendKeys("pass");
	}
	
}
