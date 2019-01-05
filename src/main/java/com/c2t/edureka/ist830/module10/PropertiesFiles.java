package com.c2t.edureka.ist830.module10;

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
	public Properties getProperties() {
		Properties  prop = new Properties();

		try {
			File f = new File(
					"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/edureka/ist830/module10/object.properties");
			InputStream fis = new FileInputStream(f);

			
			prop.load(fis);

			System.out.println(prop);
			
			String s = prop.getProperty("name1");
			System.out.println(s);
			
			

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return prop;

	}
}
