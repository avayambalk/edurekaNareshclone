package com.c2t.edureka.module8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class ReadFromFile {
	
	public static void main(String[] args) {
		File f = new File("D:/Sample.txt");
		
		try {
			FileInputStream fis = new FileInputStream(f);
		
			int data = fis.read();
			System.out.println(data);
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
