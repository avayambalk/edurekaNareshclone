package com.c2t.edureka.module9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadObject {
	Properties p = new Properties();

	public Properties getObjectRepository() {
		
		try {
			// Read object repository file
			InputStream stream = new FileInputStream(
					new File("object.properties"));
			// load all objects
			p.load(stream);
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return p;
	}
	
	
	public static void main(String[] args) {
		ReadObject obj = new ReadObject();
		try {
			Properties prop = obj.getObjectRepository();
			String button = (String)prop.get("loginButton");
			System.out.println("button="+button);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
