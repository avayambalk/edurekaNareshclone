package com.c2t.edureka.module55;


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

public class TestNGGroupPriority {
	
	
	
	@Test(priority=-1)
	public void firstName(){
		System.out.println("firstName");
	}
	
	@Test(priority=2)
	public void middleName(){
		System.out.println("middleName");
	}
	
	@Test(priority=3)
	public void lastName(){
		System.out.println("lastName");
	}
	
	
	
}
