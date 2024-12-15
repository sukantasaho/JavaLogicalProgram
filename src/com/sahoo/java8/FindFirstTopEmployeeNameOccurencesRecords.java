package com.sahoo.java8;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstTopEmployeeNameOccurencesRecords {

	public static void main(String[] args) {
		 
	  List<Employee> empList = List.of(new Employee(101, "sukanta", "bhadrak", 10000d),
			  new Employee(102, "sukanta", "bhadrak", 20000d),
			  new Employee(103, "sukanta", "balesore", 30000d),
			  new Employee(104, "rajip", "bhadrak", 10000d),
			  new Employee(105, "sukanta", "bhadrak", 10000d),
			  new Employee(106, "saroj", "bhadrak", 10000d),
			  new Employee(107, "saroj", "bhadrak", 10000d),
			  new Employee(108, "mukti", "bhadrak", 10000d),
			  new Employee(109, "manoj", "bhadrak", 10000d),
			  new Employee(110, "manoj", "bhadrak", 10000d));
	   Map<String,Long> nameMapOcc = empList.stream().map(e->e.getName()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	   System.out.println(nameMapOcc);
	   List<Long> sortedValues = nameMapOcc.entrySet().stream().map(e->e.getValue()).sorted(Collections.reverseOrder()).collect(Collectors.toList());
	   System.out.println(sortedValues);
	   Map<Integer, Employee> firstTopEmployees = new LinkedHashMap<Integer, Employee>();
	   int top = 1;
	   for(Map.Entry entry : nameMapOcc.entrySet())
	   {
		   for(int i = 0; i<top; i++)
		   {
			   if(entry.getValue()==sortedValues.get(i))
			   {
				    Employee emp = empList.get(i);
				    Integer id = emp.getEmpId();
				    firstTopEmployees.put(id, emp);
			   }
		   }
	   }
	   System.out.println(firstTopEmployees);
	
	}

}
