package com.c2t.ist830;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class Calculator {
	
	public static void add(int a, int b){
		System.out.println(a+b);
	}
	
	public static void add(String a, String b){
		System.out.println(a+b);
	}
	
	public static void add(int a, int b, int c){
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add("java","selenium");
	}
}
