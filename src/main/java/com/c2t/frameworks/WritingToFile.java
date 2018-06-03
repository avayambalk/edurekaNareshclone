package com.c2t.frameworks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingToFile {
	public static void main(String[] args) {

		File f = new File("d:/writing.txt");

		try {
			FileOutputStream fos = new FileOutputStream(f);
			fos.write(65);// A
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
