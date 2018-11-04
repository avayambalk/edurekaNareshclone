package com.c2t.edureka.module10;

import java.io.*;
import java.util.Properties;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class PropertiesFiles {
	public static void main(String[] args) {
		
		File f = new File("config.properties");
		Properties p = new Properties();
		
		try {
			InputStream is = new FileInputStream(f);
			p.load(is);
			
			String val = p.getProperty("key1");
			System.out.println(val);
			
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
