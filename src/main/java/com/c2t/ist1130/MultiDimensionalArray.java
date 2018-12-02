package com.c2t.ist1130;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int arr [][] = {
				
				
				{10,20},
				{30,40}
		};
		
		for(int i=0;i<2;i++){
			
			for(int j=0;j<2;j++){
				
				arr[i][j] = i + j + 10;
				
				System.out.println(arr[i][j]);
				
			}
			
			
		}
	}
}
