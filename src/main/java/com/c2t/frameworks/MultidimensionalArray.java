package com.c2t.frameworks;

public class MultidimensionalArray {
	public static void main(String[] args) {
		
		int arr [] = {10,20,30};

		int a[][] = new int[][] { 
			{ 10, 20 }, 
			{ 30, 40 }

		};

		int b[][] = new int[][] { 
			{ 5, 10 }, 
			{ 15, 20 }

		};

		System.out.println(a[1][1] + b[0][0]);

	}
}
