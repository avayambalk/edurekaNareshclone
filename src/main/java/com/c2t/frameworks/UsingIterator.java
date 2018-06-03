package com.c2t.frameworks;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {
	public static void main(String[] args) {

		ArrayList <String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");

		System.out.println(arrayList);
		
		Iterator<String> iter =arrayList.iterator();
		
		System.out.println(arrayList);
		
		while(iter.hasNext()){
			String str = iter.next();
			
			/*if(str.equals("B")){
				iter.remove();
			}
			System.out.println(str);*/
		}
		
		System.out.println(arrayList);
		
		/*for(String s:arrayList){
			System.out.println(s);
		}*/
	}
}
