package com.c2t.ist1130;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

class RunnableClass implements Runnable {

	public void run() {
		String id3 = Thread.currentThread().getName();
		System.out.println("id3=" + id3);
		System.out.println("I am inside run...");
	}

}

public class RunnableExample {
	public static void main(String[] args) {
		RunnableClass runnable = new RunnableClass();
		
		Thread t1 = new Thread(runnable);
		t1.start();
		
		String id1 = Thread.currentThread().getName();
		System.out.println("id1="+id1);
	}
}
