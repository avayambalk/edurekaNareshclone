package com.c2t.java;

class Student{
	String name;
	
	Student(){
		name = "Java";
	}
	
	public void display(){
		System.out.println("name = " + name);
		//System.out.println("this = " + this);
		
	}
}


public class UnderstandingThis {
	public static void main(String[] args) {
		Student student = new Student();
		student.display();
		
		System.out.println("student = " + student);
	}
}
