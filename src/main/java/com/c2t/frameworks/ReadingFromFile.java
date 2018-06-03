package com.c2t.frameworks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFromFile {
	public static void main(String[] args) throws IOException {

		File f = new File("D:/Sample.txt");
		
		FileInputStream fis = new FileInputStream(f);
		
		int i = fis.read();
		System.out.println((char)i);

	}
}
