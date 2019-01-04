package com.c2t.edureka.ist830.module9;

import java.util.List;
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

public class AL {
	public static void main(String[] args) {
		List <String> l = new ArrayList<String>();
		
		l.add("user1");
		l.add("user2");
		l.add("user3");
		
		System.out.println(l);
		
		Iterator<String> iter = l.iterator();
		
		while(iter.hasNext()){
			
			String val = iter.next();

			if(val.equals("user1")){
				iter.remove();
			}
			
		}
		
		System.out.println(l);
		
	}
}
