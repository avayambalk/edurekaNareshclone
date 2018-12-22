package com.c2t.ist1130;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class Throwkeyword {
	public static void main(String[] args) {
		int balance = 0;
		int a = 0;
		int b = 20;
		int c = 0;

		try {

			throw new Exception("The value of a cannot be 0");

		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Done....");

	}
}
