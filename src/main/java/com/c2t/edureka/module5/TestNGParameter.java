package com.c2t.edureka.module5;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class TestNGParameter {
	
	
	@Parameters({"param1"})
	@Test
	public void firstName(String s1){
		
		if(s1.equals("Firefox")){
			System.out.println("Open ff browser");
		}else{
			System.out.println("Chrome..");
		}
		
	}
	
	@Test
	public void lastName(){
		System.out.println("lastName");
	}
	
	@Test
	public void middleName(){
		System.out.println("middleName");
	}

	
}
