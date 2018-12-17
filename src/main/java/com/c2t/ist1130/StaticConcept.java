package com.c2t.ist1130;

class Connect2TechStudent{
	String name;
	static String trainer;
	
	public void display(){
		System.out.println(name);
		System.out.println(trainer);
	}
	
	public static void display_static(){
		//System.out.println(name);
		System.out.println(trainer);
	}
}

public class StaticConcept {
	public static void main(String[] args) {
		Connect2TechStudent s1 = new Connect2TechStudent();
		s1.name = "shubhi";
		s1.trainer = "naresh";
		
		Connect2TechStudent s2 = new Connect2TechStudent();
		s2.name = "Darshana";
		
		System.out.println(s2.trainer);
		s2.trainer = "Naresh Selenium Trainer";
		
		System.out.println(s1.trainer);
	}
	
}
