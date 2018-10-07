package com.c2t.frameworks;

class Student{
	String name;

	public void displayAttributes(){
		System.out.println("I am in display...");
		System.out.println("this="+this);
		System.out.println(this.name);
	}
	
	
}


public class UnderstandingThis {
	public static void main(String[] args) {
		Student student = new Student();
		student.name = "AA";
		student.displayAttributes();
		
		System.out.println("student="+student);
		
		Student student1 = new Student();
		student1.name = "BB";
		student1.displayAttributes();
		
		System.out.println("student="+student1);
		
	}
}
