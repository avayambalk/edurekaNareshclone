package com.c2t.edureka.ist830.module2;

import java.util.Scanner;

//Method overriding in Java
class Car{
	String color;
	public void startEngine(){
		System.out.println("I am start engine...");
	}
}

class Hyundai extends Car{
	
}

class BMW extends Car{
	public void startEngine(){
		System.out.println("I am start engine, with more power");
	}
}

class Browser{
	public void open(){
		System.out.println("I am browser");
	}
}

class FF extends Browser{
	public void open(){
		System.out.println("I am FF");
	}
}

class Chrome extends Browser{
	
}

public class InheritanceConcept {
	public static void main(String[] args) {
	
		
		System.out.println("Enter your browser choice..");
		Scanner scan = new Scanner(System.in);
		String userInput = scan.next();
		
		
		Browser b;
		if(userInput.equals("FF")){
			b = new FF();
		}else{
			b = new Chrome();
		}
		
		b.open();
		
		
		
	}

}
