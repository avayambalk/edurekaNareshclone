package com.c2t.ist1130;

import java.io.File;
import java.io.FileInputStream;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class ThrowsKeyword {

	static void a() throws Exception{
		System.out.println('a');
		b();
	}

	static void b() throws Exception {
		System.out.println('b');
		
			File f = new File("D:/sample.txt");
			FileInputStream fis = new FileInputStream(f);
			int i = fis.read();
	}

	public static void main(String[] args) throws Exception{
		a();
	}

}
