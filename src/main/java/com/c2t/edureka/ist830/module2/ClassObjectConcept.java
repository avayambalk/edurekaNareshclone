package com.c2t.edureka.ist830.module2;

class Student{
	int reg_no;
	String name;
	
	void study(){
		System.out.println("I am studying...");
	}
}

class Bank{
	private int balance;
	
	void display(){
		System.out.println(balance);
	}
}

public class ClassObjectConcept {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.display();
	}
}
