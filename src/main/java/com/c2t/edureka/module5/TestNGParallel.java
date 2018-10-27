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

public class TestNGParallel {
	
	@Test
	public void firstName(){
		System.out.println("firstName");
		
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	public void lastName(){
		System.out.println("lastName");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	public void lastName3(){
		System.out.println("lastName3");
		System.out.println(Thread.currentThread().getId());
	}

	
}
