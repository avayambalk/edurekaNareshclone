package com.c2t.edureka.ist830.module8;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

class Employee{
	int age;
	String name;
	
	public void display(String name){
		this.name = name;
	}
}

public class ThisKeyword {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.display("Gaston");
		
	}
}
