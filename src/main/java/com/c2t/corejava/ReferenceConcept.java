package com.c2t.corejava;

class Employee{
	
	String name;
	
}

public class ReferenceConcept {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.name = "Vijay";
		
		System.out.println(e.name);
		
		Employee e2 = e;
		
		System.out.println(e2.name);
		
		passByRef(e);
		
		System.out.println(e.name);
		
		
	}
	
	
	public static void passByRef(Employee emp){
		
		emp.name = "vijay joshi";
		
	}
}
