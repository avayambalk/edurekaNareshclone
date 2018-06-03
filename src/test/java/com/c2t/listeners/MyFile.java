package com.c2t.listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyFileListener.class)
public class MyFile {
	
	WebDriver driver = null;
	
	public void before(){
		
	}
	
	@Test
	public void myTest(){
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void myTest2(){
		Assert.assertEquals(true, true);
	}
}
