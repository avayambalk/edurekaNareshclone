package com.c2t.ist1130;

class Person{
	String name;
	int age;
	
	public void work(){
		System.out.println("I can work...");
		System.out.println("name="+name);
		System.out.println("this="+this);
		System.out.println("this.name="+this.name);
	}
}

public class ClassObjectConcepts {
	
	
	public static void changeValue(Person nickName){
		nickName.name = "java programming";
		System.out.println("nickName="+nickName);
	}
	
	
	public static void main(String[] args) {
		
		Person p2 = new Person();
		p2.name = "java1";
		p2.age = 10;
		
		changeValue(p2);
		
		System.out.println(p2.name);
		System.out.println("p2="+p2);
	}
}
