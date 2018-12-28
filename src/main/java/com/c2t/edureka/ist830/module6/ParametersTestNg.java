package com.c2t.edureka.ist830.module6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class ParametersTestNg {
	
	
	@Parameters({"userid","password"})
	@Test
	public void login(String u, String p){
		
		System.out.println("send username="+u);
		System.out.println("send password="+p);
		System.out.println("click");
	}
	
}
