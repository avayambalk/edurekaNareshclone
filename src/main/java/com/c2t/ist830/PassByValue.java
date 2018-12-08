package com.c2t.ist830;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class PassByValue {
	
	public static void method(int a, int b){
		
		a = a+10;
		b = b+20;
		
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		System.out.println("before calling method...");
		System.out.println(x);
		System.out.println(y);
		
		method(x,y);
		
		System.out.println("after calling method...");
		System.out.println(x);
		System.out.println(y);
	}
}
