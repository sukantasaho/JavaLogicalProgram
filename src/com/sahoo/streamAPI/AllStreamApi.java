package com.sahoo.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AllStreamApi {

	public static void main(String[] args) {
     
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Sukanta", 25, "Male", "HR", 2021, 98000d));
		employees.add(new Employee(2, "Rajip", 45, "Male", "Sales", 2012, 20000d));
		employees.add(new Employee(3, "Rakesh", 35, "Male", "Infrastructure", 2022, 56000d));
		employees.add(new Employee(4, "Anita", 26, "Female", "Development", 2017, 45000d));
		employees.add(new Employee(5, "Amrita", 65, "Female", "Security", 2018, 37000d));
		employees.add(new Employee(6, "Bishnu", 75, "Male", "Finance", 2013, 65000d));
		employees.add(new Employee(7, "Ramesh", 24, "Male", "Infrastructure", 2021, 34000d));
		employees.add(new Employee(8, "Mahesh", 25, "Male", "Security", 2014, 65000d));
		employees.add(new Employee(9, "Animesh", 45, "Male", "Development", 2018, 72000d));
		employees.add(new Employee(10, "Rajalaxmi", 28, "Female", "Sales", 2011, 87000d));
		employees.add(new Employee(11, "Smruti", 29, "Female", "Development", 2018, 41000d));
		employees.add(new Employee(12, "Khirod", 30, "Male", "HR", 2016, 32000d));
		employees.add(new Employee(13, "Naveen", 32, "Male", "Security", 2024, 54000d));
		employees.add(new Employee(14, "Jay", 43, "Male", "Development", 2021, 89000d));
		employees.add(new Employee(15, "Keerthi", 35, "Male", "Sales", 2010, 32000d));
		employees.add(new Employee(16, "Subhalaxmi", 53, "Female", "HR", 2008, 23000d));
		
		//1.How many male and female employees are there in the organisation?
		Map<String,Long> genders = employees.parallelStream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
	    System.out.println("Total Gender Employee"+genders);
	    System.out.println("**********************************************");
	     
	    //2. Print the name of all departments in the organisation?
	    System.out.println("All Department Names");
	    System.out.println("************************************************************");
	    employees.parallelStream().map(emp->emp.getDepartment()).distinct().forEach(e->System.out.println(e));
	    System.out.println("************************************************************");
	    
	    //3. What is the average age of male and female employees?
	    //Double avgAgeEmployees = employees.stream().filter(e->e.getGender().equals("Male") || e.getGender().equals("Female")).collect(Collectors.averagingDouble(e->e.getAge()));
	    //System.out.println("\nThe average age of male and female employees are :: "+Math.round(avgAgeEmployees));
	    System.out.println("The average age of male and female employees are"); 
	    Map<String, Double> avgMaleAndFemaleEmp = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
	     System.out.println(avgMaleAndFemaleEmp);
	     System.out.println("************************************************************");
	     
	     //4.Get the details of highest paid employee in the organisation?
	    Employee highestSalaryEmp = employees.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.getSalary()))).get();
	    System.out.println("Highest paid employee in the organisation :: "+highestSalaryEmp);
	    System.out.println("********************************************************************************************************************");
	    
	    //5. Get the names of all employees who have joined after 2015?
	   List<String> names = employees.stream().filter(e->e.getYearOfJoining()>2015).map(e->e.getName()).toList();
	   System.out.println("The names of all employees who have joined after 2015 :: "+names);
	   System.out.println("********************************************************************************************************************");
	   
	   //6. Count the no of employees in each department?
	   Map<String,Long> departments = employees.stream().map(e->e.getDepartment()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	   System.out.println("The no of employees in each department :: "+departments);
	   System.out.println("********************************************************************************************************************");
	   
	   //7. What is the average salary of each department?
	   System.out.println("The average salary of each department");
	   Map<String, Double> avgDeptSalary = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
	   System.out.println(avgDeptSalary);
	   System.out.println("************************************************************************************************************");
	     
	   //8.Get The details of youngest male employee in the development department?
	  Optional<Employee>  opt = employees.stream().filter(e->e.getGender().equals("Male") && e.getDepartment().equals("Development")).collect(Collectors.minBy(Comparator.comparing(e->e.getAge())));
	    if(opt.isPresent()) {
	    	Employee emp = opt.get();
	    	System.out.println("The details of youngest male employee in the development department");
	    	System.out.println("Id-"+emp.getId()+" Name-"+emp.getName()+" Gender-"+emp.getGender()+" Age-"+emp.getAge()+" Department-"+emp.getDepartment());
	        System.out.println("*************************************************************************************************************************");
	    }
	    
	    //9. Who has the most working experience in the organisation?
	   Optional<Employee> expOpt = employees.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
	   if(expOpt.isPresent()) {
		   System.out.println("The most working experience in the organisation");
		   Employee mustExpEmp = expOpt.get();
		   System.out.println("ID-"+mustExpEmp.getId()+" Name-"+mustExpEmp.getName()+" Year Of Joining-"+mustExpEmp.getYearOfJoining()+" Age-"+mustExpEmp.getAge());
		   System.out.println("*********************************************************************************");
	   }
	   //10. How many male and female employees are there in Sales department?
	   
	   Map<String, Long> maleAndFemaleDeptOfSales = employees.stream().filter(e->e.getDepartment().equals("Sales")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
	   System.out.println("Male and female employees are there in Sales department");
	   System.out.println(maleAndFemaleDeptOfSales);
	   System.out.println("*********************************************************************************");
	   
	   //11. what is the average salary of male and female employees?
	   Map<String,Double> avgSalaryMaleAndFemaleEmp = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
	   System.out.println("The average salary of male and female employees");
	   System.out.println(avgSalaryMaleAndFemaleEmp);
	   System.out.println("****************************************************************************************");
	   
	   //13 What is the average salary and total salary of the whole organisation? 
	   Double totalSalary =  employees.stream().collect(Collectors.summingDouble(Employee::getSalary));
	   System.out.println("Total Salary of all employees in the organisation - "+totalSalary);
	   Double avgSalaryOrg = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
	   System.out.println("Total Avg Salary In Org-"+avgSalaryOrg);
	   System.out.println("****************************************************************************************");
	   
	   //15. Who is the oldest employee in the organisation ? What is his age and which department he belongs to?
	  Employee oldestEmp = employees.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining))).get();
	  System.out.println("Oldest Employee in the organisation :: Age-"+oldestEmp.getAge()+" And Department-"+oldestEmp.getDepartment()+" Year of Joining-"+oldestEmp.getYearOfJoining());
	  System.out.println("********************************************************************************************"); 
	  int[] numbers = {1,2,4,5,6,7,8};
	   int s = Arrays.stream(numbers).reduce(0, (a,b)->a+b);
	   System.out.println(s);
	   //12. List down the names of all employees in each department?
	   Map<String, List<String>> namesInEachDept = employees.stream()
       .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName, Collectors.toList())));
	   System.out.println("The names of all employees in each department");
	   System.out.println(namesInEachDept);
	   System.out.println("=========================================================================================");
	   
	   //16.Find out even and odd and print it in single line
	   int[] nums = {2,5,7,3,23,56,78,98,76,65,54,31,234,567,897,321,345,789,643,213,454};
	   Map<Boolean, List<Integer>> evenOddMap =  Arrays.stream(nums).boxed().collect(Collectors.groupingBy(e->e%2==0));
	   System.out.println(evenOddMap);
	}

}

