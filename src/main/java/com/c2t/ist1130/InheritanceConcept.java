package com.c2t.ist1130;

import java.util.Scanner;

class Car{
	public void startEngine(){
		System.out.println("startEngine...");
	}
}

class Maruti extends Car{

}

class BMW extends Car{
	public void startEngine(){
		System.out.println("startEngine of bmw...");
	}
}


public class InheritanceConcept {
	public static void main(String[] args) {
		
		Car c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Specify your car....");
		String userInput = scan.nextLine();
		
		if(userInput.equals("BMW")){
			c = new BMW();
		}else{
			c = new Car();
		}
		
		c.startEngine();
		
	}
}
