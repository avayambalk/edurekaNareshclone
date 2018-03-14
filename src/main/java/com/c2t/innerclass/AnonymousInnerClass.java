package com.c2t.innerclass;

interface Base{
	void m1();
}

class Derived implements Base{
	public void m1(){
		System.out.println("I am in derived.....");
	}
}


public class AnonymousInnerClass {
	public static void main(String[] args) {
		
		/*int a = 10;
	
		Base b = new Derived();
		b.m1();*/
		
		
		Base b1 = new Base(){
			public void m1(){
				System.out.println("i am here....");
			}
		};
		
		b1.m1();
		
	}
}
