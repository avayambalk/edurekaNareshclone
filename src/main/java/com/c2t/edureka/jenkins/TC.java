package com.c2t.edureka.jenkins;

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

public class TC {
	
	@BeforeTest
	public void before(){
		System.out.println("Before...");
	}
	
	@Test
	public void test1(){
		System.out.println("Hello1..");
	}
	
	@Test
	public void test2(){
		System.out.println("Hello2..");
	}
}
