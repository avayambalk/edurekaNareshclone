package com.c2t.ist1130;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

abstract class Shape {
	abstract public void draw();
	public void color(){
		System.out.println("red");
	}
}

class Circle extends Shape{
	
	public void draw(){
		System.out.println("I am circle..");
	}
	
}

class Triangle extends Shape{
	
	public void draw(){
		System.out.println("I am Triangle..");
	}
	
}

public class AbstractConcepts {
	public static void main(String[] args) {
		Shape s  = new Circle();
		s.draw();
		s.color();
	}
}
