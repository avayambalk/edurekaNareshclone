package com.c2t.ist830;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromFile {
	public static void main(String[] args) {

		File f = new File("D:/Sample.t");

		try {
			FileInputStream fis = new FileInputStream(f);

			int i = fis.read();
			System.out.println(i);
			System.out.println((char) i);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (IOException e2) {
			System.out.println(e2);
		}

		System.out.println("Done...");

	}
}
