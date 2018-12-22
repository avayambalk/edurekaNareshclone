package com.c2t.ist1130;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class ListDs {
	public static void main(String[] args) {
		ArrayList <String> l = new ArrayList<String>();
		l.add("A");
		l.add("B");
		l.add("A");
		
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
		
		Iterator<String>  iter =l.iterator();
		
		while(iter.hasNext()){
			String s = iter.next();
			System.out.println(s);
		}
		
	}
}
