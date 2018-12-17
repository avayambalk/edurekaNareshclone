package com.c2t.ist1130.p1;

import com.c2t.ist1130.p2.File2;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

class Bank{
	private int balance=10000;
	
	void display(){
		System.out.println(balance);
	}
}



public class File1 {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.display();
	}
}
