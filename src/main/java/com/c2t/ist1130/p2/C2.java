package com.c2t.ist1130.p2;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

import com.c2t.ist1130.p1.C1;

public class C2 extends C1{
	void m2(){
		C2 c = new C2();
		c.m1();
		
		//C1 c1 = new C1();
		//c1.m1();
	}
	
	public static void main(String[] args) {
		C2 c2 = new C2();
		c2.m2();
	}
}
