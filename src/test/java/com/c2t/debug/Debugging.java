package com.c2t.debug;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */


class Debug{
	int a=10;
	public void display(){
		System.out.println("a="+a);
	}
}

public class Debugging {
	public static void main(String[] args) {
		Debug d = new Debug();
		d.display();
	}
}
