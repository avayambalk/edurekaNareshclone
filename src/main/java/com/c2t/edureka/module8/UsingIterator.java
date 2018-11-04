package com.c2t.edureka.module8;

import java.util.*;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class UsingIterator {
	
	public static void main(String[] args) {
		List <String> l = new  ArrayList <String> ();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		System.out.println(l);
		
		Iterator <String> iter = l.iterator();
		
		while(iter.hasNext()){
			String s = iter.next();
			System.out.println(s);
		}
		
	}

}
