package com.c2t.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadingPropertiesFile {
	public static void main(String[] args) {
		

		try {
			
			Properties prop = new Properties();
			InputStream input = new FileInputStream("config.properties");
			prop.load(input);
			
			String userName = prop.getProperty("username");
			System.out.println(userName);
			
			String username1 = prop.getProperty("username1");
			System.out.println(username1);
			

			/*input = new FileInputStream("config.properties");

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			System.out.println(prop.getProperty("database"));
			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("password"));*/

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
		
		}
	}
}
