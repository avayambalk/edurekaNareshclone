package com.c2t.framework.hybrid;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadObject {
	Properties p = new Properties();

	public Properties getObjectRepository() throws IOException {
		// Read object repository file
		InputStream stream = new FileInputStream(
				new File(
						System.getProperty("user.dir")
								+ "\\src\\main\\java\\com\\c2t\\framework\\hybrid\\object.properties"));
		// load all objects
		p.load(stream);
		return p;
	}
	
	
	public static void main(String[] args) {
		ReadObject obj = new ReadObject();
		try {
			Properties prop = obj.getObjectRepository();
			String button = (String)prop.get("loginButton");
			System.out.println("button="+button);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
