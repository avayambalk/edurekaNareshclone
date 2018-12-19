package com.c2t.edureka.ist830.module2;

class Student{
	int reg_no;
	String name;
	
	void study(){
		System.out.println("I am studying...");
	}
}

public class ClassObjectConcept {
	public static void main(String[] args) {
		int a = 10;
		Student s = new Student();
		s.name = "ram";
		s.reg_no = 100;
		
		System.out.println(s.name);
		System.out.println(s.reg_no);
		
		s.study();
	}
}
