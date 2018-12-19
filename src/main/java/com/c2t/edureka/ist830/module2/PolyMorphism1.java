package com.c2t.edureka.ist830.module2;


//Method Overloading
class Caclulator {
	void add(int x, int y){
		System.out.println(x+y);
	}
	
	void add(int x, int y, int z ){
		System.out.println(x+y+z);
	}
	
	void add(double d1, double d2){
		System.out.println(d1+d2);
	}
}

public class PolyMorphism1 {
	public static void main(String[] args) {
		Caclulator c = new Caclulator();
		c.add(10, 20);
		c.add(10, 20, 30);
		c.add(10.5, 11.5);
	}
}
