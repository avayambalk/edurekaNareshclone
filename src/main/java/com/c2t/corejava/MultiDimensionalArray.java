package com.c2t.corejava;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		
		int m1[][] = {
					{10,20},
					{30,40,10,20},
					{50,60}
		};
		
		int m2[][] ={
				{10,20},
				{30,40}
		};
		
		//System.out.println(m1[0][0]+m2[0][1]);
		System.out.println(m1.length);
		System.out.println(m2.length);
		
		System.out.println(m1[1].length);
		
	}
}
