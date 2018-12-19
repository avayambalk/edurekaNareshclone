package com.c2t.edureka.ist830.module2;

abstract class Shape {
	abstract void draw();
	
	void paint(){
		System.out.println("I am paint...");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("i am circle...");
	}
	
	void color(){
		
	}
}

public class AbstractConcept {
	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
	}
}
