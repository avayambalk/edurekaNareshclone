package com.c2t.ist1130;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class ReadFromFile {
	public static void main(String[] args) {
		File f = new File("D:/Sample.txt");
		
		try {
			FileInputStream fis = new FileInputStream(f);
			int i = fis.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
