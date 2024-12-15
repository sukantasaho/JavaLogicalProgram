package com.dp.builderDP;

public class TestBuilderDP {

	public static void main(String[] args) {
		 Employee e1 = new Employee.Builder("sukanta", "sahoo", 88488484l, 8738838993l, 63, 'M')
				 .addQualifications(new String[] {"10th","ITI","Diploma","B-Tech"}).build();
		//String firstName, String lastName, Long mobNo, Long aadharId, Integer age, Character gender
		 System.out.println(e1.getFirstName());
		 for(String q : e1.getQualification())
		 {
			 System.out.println(q);
		 }
		 

	}

}
