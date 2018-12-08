package com.c2t.ist1130;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class Calculator {
	
	
	public static void main(String[] args) {
		
		add(10.5,20);
		add(10,20,30);
		add(10.5,20.5);
		
	}
	
	public static int add(int x, int y){
		return x + y;
	}
	
	public static void add(double x, int y){
		System.out.println(x + y);
	}
	
	public static void add(double x, double y){
		 System.out.println(x + y);
	}
	
	public static int add(int x, int y, int z){
		return x + y;
	}
	
}
