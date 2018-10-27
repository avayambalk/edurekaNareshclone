package com.c2t.testng.basic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
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

public class MyFirstTestNgSuite {
	
	
	@Test
	public void lastName() {
		System.out.println("lastName...");
		System.out.println("id1=="+Thread.currentThread().getId());
	}

	@Test
	public void firstName() {
		System.out.println("firstName...");
		System.out.println("id1=="+Thread.currentThread().getId());
	}
	
	

}
