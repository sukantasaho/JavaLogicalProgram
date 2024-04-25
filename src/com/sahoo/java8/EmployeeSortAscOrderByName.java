package com.sahoo.java8;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSortAscOrderByName {

	public static void main(String[] args) {
		 List<Employee> eList = List.of(
				                        new Employee(101, "sukanta","bhadrak", 25000d),
				                        new Employee(102, "mukti","balesore", 23000d),
				                        new Employee(103, "raja","puri", 26000d),
				                        new Employee(104, "abhi","kothar", 28000d),
				                        new Employee(105, "rakhi","bhadrak", 75000d),
				                        new Employee(106, "Sukanta","bhadrak", 25000d));
		 //eList.stream().sorted((o1, o2) -> o2.getName().compareToIgnoreCase(o1.getName())).forEach(e->System.out.println(e.getName()));
		List<String> nameList = eList.stream().filter(e->e.getSalary()>26000d).map(e->e.getName()).collect(Collectors.toList());
	    System.out.println(nameList);
	}

}
