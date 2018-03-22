package com.c2t.corejava;

import java.io.File;
import java.io.FileInputStream;

public class ReadFromFile {
	public static void main(String[] args) {
		File f = new File("D:/Sample.txt");
		
		try {
			FileInputStream fis = new FileInputStream(f);
			char i = (char)fis.read();
			System.out.println(i);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
