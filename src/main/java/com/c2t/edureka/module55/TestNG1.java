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

public class TestNG1 {
	
	@Test
	public void firstName(){
		System.out.println("firstName");
		
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	public void lastName(){
		
		//open browser
		//loging to the url
		//finish ur work
		//log out
		//close bowser
		
		System.out.println("lastName");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	public void lastName3(){
		System.out.println("lastName3");
		System.out.println(Thread.currentThread().getId());
	}

	
}
