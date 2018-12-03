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
	
	public static int add(int x, int y){
		int sum = x+y;
		return sum;
	}

	public static void main(String[] args) {
		int s = add(10,20);
		System.out.println(s);
	}
}
