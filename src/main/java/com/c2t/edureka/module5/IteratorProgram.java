package com.c2t.edureka.module5;

import java.util.*;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class IteratorProgram {
	public static void main(String[] args) {
		Set <String> s = new HashSet<String>();
		s.add("one");
		s.add("two");
		
		Iterator<String> iter = s.iterator();
		
		while(iter.hasNext()){
			String val = iter.next();
			System.out.println(val);
		}
		
		
	}
}