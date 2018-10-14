package com.c2t.corejava;

public class Array {
	public static void main(String[] args) {
		
		int a [] = new int [5];  //4*5
		
		for(int i=0;	i<5;	i++){
			System.out.println(a[i]);
		}
		
		System.out.println("---------------------");
		
		for(int i=0;	i<5;	i++){
			
			a[i] = i + 10;
			
			System.out.println(a[i]);
		}
		
	}
}
