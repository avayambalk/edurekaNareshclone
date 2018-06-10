package com.c2t.util;

public class SeleniumUtil {

	public static String getRootDir() {
		String rootDir = System.getProperty("user.dir");
		System.out.println("rootDir--------------" + rootDir);
		rootDir = rootDir.replace('\\', '/');
		String dir = "file:///" + rootDir + "/" + "src/main/resources/";
		//System.out.println("dir---------------->" + dir);
		return dir;
	}
	
	public static String getSrcTestJava() {
		String rootDir = System.getProperty("user.dir");
		//System.out.println("rootDir--------------" + rootDir);
		rootDir = rootDir.replace('\\', '/');
		String dir = "file:///" + rootDir + "/" + "src/test/java/";
		//System.out.println("dir---------------->" + dir);
		return dir;
	}

	public static void main(String[] args) {
		getRootDir();
	}

	public static void slowDownProcess() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void slowDownProcess(int timer) {

		try {
			Thread.sleep(timer);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
