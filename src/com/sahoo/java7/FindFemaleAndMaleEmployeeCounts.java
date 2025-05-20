// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.*;
class FindFemaleAndMaleEmployeeCounts {
    public static void main(String[] args) {
        Employee e1 = new Employee();
		 e1.setEmpNo(1001);e1.setEname("sukanta");e1.setGender("female");e1.setSalary(2000d);
		 
		 Employee e2 = new Employee();
		 e2.setEmpNo(1002);e2.setEname("raja");e2.setGender("male");e2.setSalary(5000d);
		 
		 Employee e3 = new Employee();
		 e3.setEmpNo(1003);e3.setEname("sanju");e3.setGender("Male");e3.setSalary(6000d);
		 
		 Employee e4 = new Employee();
		 e4.setEmpNo(1004);e4.setEname("rakesh");e4.setGender("Female");e4.setSalary(9000d);
		 
		 List<Employee> eList = List.of(e1,e2,e3,e4);
		Map<String, List<Employee>> map = eList.stream()
		.collect(Collectors.groupingBy(e->e.getGender().toLowerCase()));
		System.out.println(map);
    }
}
 

class Employee 
{
       private Integer empNo;
       private String ename;
       private String gender;
       private Double salary;
       
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
       
       
}
