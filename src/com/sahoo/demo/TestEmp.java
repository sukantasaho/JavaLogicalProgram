package com.sahoo.demo;

public class TestEmp {

	public static void main(String[] args) {
		 
		Employee e1 = new Employee(101,"sukanta",3000.0);
		Employee e2 = new Employee(101,"sukanta",3000.0);;
		System.out.println(e1.equals(e2));
		
		System.out.println(e1 == e2);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.hashCode()+"==="+e2.hashCode());
		 
	}
}
