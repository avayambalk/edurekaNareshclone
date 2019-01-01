package com.c2t.edureka.ist830.module7;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class Node1 {
	
	WebDriver driver;
	
	@BeforeTest
	public void before() throws MalformedURLException{
		
		String remoteUrl = "http://192.168.137.1:5555/wd/hub";
		String url = "https://www.facebook.com/";
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WIN10);
		
		URL remote = new URL(remoteUrl);
		
		driver = new RemoteWebDriver(remote, capabilities);
		driver.get(url);
		
	}
	
	@Test
	public void test1(){
	}
}
