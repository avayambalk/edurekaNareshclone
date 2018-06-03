package com.c2t.basics;

class Driver{
	
}

public class Scope {
	
	static int a = 10;
	
	static Driver d;
	
	public static void main(String[] args) {
		
		//
		d = new Driver();
		
		int a = 20;
		
		System.out.println(a);
	}
	
	public static void method(){
		System.out.println(a);
	}
}
