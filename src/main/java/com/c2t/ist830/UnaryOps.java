package com.c2t.ist830;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class UnaryOps {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		int d;
		
		c = ++a; // a = a+1
		
		System.out.println(a);
		System.out.println(c);
		
		d = b++;
		System.out.println(b); //21
		System.out.println(d); //20
	}
}
