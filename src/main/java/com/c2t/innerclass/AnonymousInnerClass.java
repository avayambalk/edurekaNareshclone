package com.c2t.innerclass;

class Popcorn {
	public void pop() {
		System.out.println("popcorn");
	}
}

class Food {
	Popcorn p = new Popcorn() {
		public void pop() {
			System.out.println("anonymous popcorn");
		}
	};
	
	public void foodie(){
		p.pop();
	}
}

public class AnonymousInnerClass {
	public static void main(String[] args) {
		Food f = new Food();
		f.foodie();
		
	}
}
