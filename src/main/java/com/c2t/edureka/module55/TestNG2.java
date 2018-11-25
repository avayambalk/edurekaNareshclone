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

public class TestNG2 {
	
	@Test
	public void firstName(){
		System.out.println("firstName");
	}
	
	@Test
	public void lastName(){
		throw new RuntimeException();
	}

	
}
