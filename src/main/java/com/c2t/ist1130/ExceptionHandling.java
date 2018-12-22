package com.c2t.ist1130;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class ExceptionHandling {
	public static void main(String[] args) {
		int a = 0;
		int b = 20;
		int c = 0;
		
		int arr[]= {10,20,30};
		
		System.out.println("c1="+c);
		
		try{
			c = b/a;
			
			System.out.println(arr[5]);
			
			System.out.println("After division...");
			
		}finally{
			System.out.println("I am in finally...");
		}
		
		System.out.println("c2="+c);
		
	}
}
