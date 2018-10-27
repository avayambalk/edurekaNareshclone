package com.c2t.edureka.module5;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class TestNGGroupEnabled {
	
	
	
	@Test(enabled=false)
	public void firstName(){
		System.out.println("firstName");
	}
	
	@Test
	public void middleName(){
		System.out.println("middleName");
	}
	
	@Test
	public void lastName(){
		System.out.println("lastName");
	}
	
	
	
}
