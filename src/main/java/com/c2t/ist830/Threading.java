package com.c2t.ist830;

import java.lang.Thread;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

class MyThread extends Thread {

	public void run() {
		System.out.println("i am run..");

		long id2 = Thread.currentThread().getId();
		System.out.println("id2=" + id2);
	}

	
}

public class Threading {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		//t.run();
		t.start();

		long id1 = Thread.currentThread().getId();
		System.out.println("id1=" + id1);
	}
}
