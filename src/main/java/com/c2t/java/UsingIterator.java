package com.c2t.java;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {
	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList<String>();
		
		al.add("Divya");
		al.add("Pratima");
		al.add("Tomes");
		
		Iterator<String> iter = al.iterator();
		
		while(iter.hasNext()){
			
			String s = iter.next();
			System.out.println(s);
			
		}
		
		
	}
}
