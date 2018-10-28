package com.c2t.edureka.module8;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */


class Employee{
	
	String name;
	
	public void method(){
		System.out.println("I am method...");
		System.out.println("this="+this);
	}
	
}

public class ThisConcept {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.method();
		System.out.println("e="+e);
		
		System.out.println("------------------------");
		
		Employee e2 = new Employee();
		e2.method();
		System.out.println("e2="+e2);
	}
}








