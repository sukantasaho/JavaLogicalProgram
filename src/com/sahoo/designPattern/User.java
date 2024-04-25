package com.sahoo.designPattern;

public class User {

	final private String firstName;
	final private String lastName;
	final private Integer age;
	final private Long mobNo;
	
	public User(UserBuilder ub) {
		 this.firstName = ub.firstName;
		 this.lastName = ub.lastName;
		 this.age = ub.age;
		 this.mobNo = ub.mobNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Integer getAge() {
		return age;
	}
	public Long getMobNo() {
		return mobNo;
	}
	
	static class UserBuilder
	{
		private String firstName;
		private String lastName;
		private Integer age;
		private Long mobNo;
		
		public UserBuilder(String firstName, String lastName) 
		{
			 this.firstName = firstName;
			 this.lastName = lastName;
		}
		public UserBuilder addAge(Integer age)
		{
			this.age = age;
			return this;
		}
		public UserBuilder addMobileNo(Long mobNo)
		{
			this.mobNo = mobNo;
			return this;
		}
		public User build()
		{
			User user = new User(this);
			return user;
		}
	}
	public static void main(String[] args) {
		 User u1 = new User.UserBuilder("Sukanta", "sahoo").build();
		 System.out.println(u1.getFirstName()+"  "+u1.getLastName()+" "+u1.getAge()+"  "+u1.getMobNo());
		 
		 User u2 = new User.UserBuilder("Manoj", "Sahoo")
				   .addAge(38).addMobileNo(9388883883l).build();
		 System.out.println(u2.getFirstName()+"  "+u2.getLastName()+" "+u2.getAge()+"  "+u2.getMobNo());
		 
		 User u3 = new User.UserBuilder("Manoj", "Sahoo")
				   .addMobileNo(9388883883l).build();
		 System.out.println(u3.getFirstName()+"  "+u3.getLastName()+" "+u3.getAge()+"  "+u3.getMobNo());
		 
		 User u4 = new User.UserBuilder("Manoj", "Sahoo")
				   .addAge(48).build();
		 System.out.println(u4.getFirstName()+"  "+u4.getLastName()+" "+u4.getAge()+"  "+u4.getMobNo());
		  
	}
}
