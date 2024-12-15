package com.sahoo.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sahoo.streamAPI.*;

 

public class FilterDemo {

	public static void main(String[] args) {
       Stream<String> stateNames = Stream.of("Odisha","Hyderabad","Bangalore","Pune","Chennai");
       stateNames.filter(state->state.equals("Odisha"));
       List<String> departments = Arrays.asList("HR","Finance","HR","Accountant","Accountant","Accountant","HR");
       Map<String, Long> hrGroups = departments.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       System.out.println(hrGroups);
	  /*Employee e1 = new Employee("Sukanta", "Bangalore", "Development");
	  Employee e2 = new Employee("Manoj", "Hyderabad", "Support");
	  Employee e3 = new Employee("Saroj", "Bangalore", "Development");
	  Employee e4 = new Employee("Rajip", "Odisha", "Development");
	  Employee e5 = new Employee("Manish", "Pune", "Devops");
	  Employee e6 = new Employee("Rakesh", "Bangalore", "Support");
	  Employee e7 = new Employee("Amit", "Bangalore", "Devops");
	  Employee e8 = new Employee("M Sharma", "Bangalore", "HR");
	  List<Employee> employeesList = List.of(e1,e2,e3,e4,e5,e6,e7,e8);
	  //{Development=[{"Sukanta", "Bangalore", "Development"}]}
	  Map<String,List<Employee>> groupedEmp = employeesList.stream().collect(Collectors.groupingBy(e->e.getDept()));
	  System.out.println(groupedEmp);*/
	  
	  //create product list which is having -name,category,price requirement is group all products based on category
	  //output-{electronics=[{"Samsung LED TV",23999.0,"electronics"}]}
       
	}
	
	

}
