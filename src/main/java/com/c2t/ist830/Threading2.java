package com.c2t.ist830;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

class MyThead2 implements Runnable {
	public void run() {
		long id2 = Thread.currentThread().getId();
		System.out.println("id2=" + id2);
	}
}

public class Threading2 {
	
	public static void main(String[] args) {
		
		MyThead2 runnable = new MyThead2();
		
		Thread t = new Thread(runnable);
		t.start();
		
		long id1 = Thread.currentThread().getId();
		System.out.println("id1=" + id1);
	}

}
