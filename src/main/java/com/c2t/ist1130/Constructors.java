package com.c2t.ist1130;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

class Remote{
	public void display(){
		System.out.println("I am display method...");
	}
	
	Remote(){
		System.out.println("I am remote...");
	}
}


public class Constructors {
	public static void main(String[] args) {
		Remote r = new Remote();
		
	}
}
