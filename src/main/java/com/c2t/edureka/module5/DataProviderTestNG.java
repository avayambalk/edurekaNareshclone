package com.c2t.edureka.module5;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class DataProviderTestNG {
	
	@DataProvider
	public String[][] getData(){
		
		String data [][] = {
				{"A","B","C"},
				{"A1","B1","C1"},
				{"A2","B2","C2"}
				
		};
		
		return data;
	}
	
	@Test(dataProvider = "getData")
	public void useData(String s1, String s2, String s3){
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s3="+s3);
	}

}
