package com.c2t.edureka.ist830.module2;

class Car1{
	String color;
	
	Car1(){
		System.out.println("I am Car1");
	}
	
	public void startEngine(){
		System.out.println("I am start engine...");
	}
}


class BMW1 extends Car1{
	
	BMW1(){
		System.out.println("I am BMW1");
	}
	
	public void startEngine(){
		System.out.println("I am start engine, with more power");
	}
}

public class ConstructorsConcept {
	public static void main(String[] args) {
		BMW1 b = new BMW1();
	}
}
