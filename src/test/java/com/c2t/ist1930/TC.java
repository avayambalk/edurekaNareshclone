package com.c2t.ist1930;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */


@Listeners(Listener.class)
public class TC {
	@Test
	public void test(){
		System.out.println("hello");
	}
}
