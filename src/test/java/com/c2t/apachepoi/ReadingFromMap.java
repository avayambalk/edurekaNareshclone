package com.c2t.apachepoi;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ReadingFromMap {
	public static void main(String[] args) {
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1", new Object[] { "ID", "NAME", "LASTNAME" });
		data.put("2", new Object[] { 1, "Amit", "Shukla" });
		data.put("3", new Object[] { 2, "Lokesh", "Gupta" });
		data.put("4", new Object[] { 3, "John", "Adwards" });
		data.put("5", new Object[] { 4, "Brian", "Schultz" });
		
		Set<String> keyset = data.keySet();
		
		for (String key : keyset) {
			Object[] objArr = data.get(key);
			for (Object obj : objArr) {
				System.out.println(obj);
			}
			System.out.println("-------------");
		}
	}
}
