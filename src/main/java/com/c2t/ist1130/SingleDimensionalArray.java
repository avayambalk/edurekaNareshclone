package com.c2t.ist1130;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class SingleDimensionalArray {
	public static void main(String[] args) {
		
		int arr5[];
	
		int arr [] = new int [5];
		int  [] arr2  = new int [5];
		int arr3[] = {10,20,30,40,50};
		int arr4[] = new int []{10,20,30,40,50};
		
		
		for(int i=0;i<arr.length ; i ++){
			arr[i] = i + 10;
			System.out.println(arr[i]);
		}
	}
}
