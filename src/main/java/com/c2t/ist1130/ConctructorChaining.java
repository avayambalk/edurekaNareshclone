package com.c2t.ist1130;

class Parent{
	Parent(){
		System.out.println("Parent...");
	}
}

class Child extends Parent{
	Child(){
		super();
		System.out.println("I am child");
	}
}


public class ConctructorChaining {
	public static void main(String[] args) {
		Child c = new Child();
		
	}
}
