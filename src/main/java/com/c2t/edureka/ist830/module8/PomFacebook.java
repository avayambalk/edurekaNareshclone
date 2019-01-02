package com.c2t.edureka.ist830.module8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class PomFacebook {
	WebDriver driver1;

	PomFacebook(WebDriver driver) {
		driver1 = driver;
	}

	public void findEmail(String user) {
		driver1.findElement(By.id("mail")).sendKeys(user);
	}

	public void findPassword(String password) {
		driver1.findElement(By.id("pass")).sendKeys(password);
	}

	public void submit() {
		driver1.findElement(By.id("loginbutton")).click();
	}
	
	
	public void login(String user, String pwd){
		findEmail(user);
		findPassword(pwd);
		submit();
	}
	
	

}
