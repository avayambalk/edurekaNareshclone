package com.c2t.ist1130;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class VariableScopeConcept {
	static int a = 10;
	
	public static void main(String[] args) {
		int c = 20;
		System.out.println(a);
	}
	
	public static void function2(){
		System.out.println(a);
		//System.out.println(c);
	}
}
