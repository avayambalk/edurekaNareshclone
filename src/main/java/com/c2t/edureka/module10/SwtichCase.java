package com.c2t.edureka.module10;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class SwtichCase {
	public static void main(String[] args) {
		String day = "monday1";

		switch (day) {

		case "monday":
			System.out.println("This is monday");
			break;
		case "tuesday":
			System.out.println("This is tuesday");
			break;
		default:
			System.out.println("None of conditions met...");
			break;
		}

	}
}
