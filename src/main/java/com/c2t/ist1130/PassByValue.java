package com.c2t.ist1130;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class PassByValue {

	public static void sum(int x, int y){
		x =  x + 10;
		y = y + 20;
		
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before calling function...");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		sum(a,b);
		
		System.out.println("After calling function...");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
	}
	
}
