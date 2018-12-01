package com.c2t.edureka.module9;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class ExceptionHandling {
	public static void main(String[] args) {
		int a = 0;
		int b = 20;
		int c = 0;
		
		System.out.println("c1="+c);
		
		try {
			c = b/a;
		} catch (Exception e) {
			System.out.println("error occured.."+e);
		}
	
		
		
		System.out.println("c2="+c);
	}
}
