package com.dp.builderDP;

public class Employee {

	private String firstName;//req field
	private String lastName;//req field
	private Long mobNo;//req field
	private String address;//opt field
	private Long aadharId;//req field
	private Integer age;//req field
	private Character gender;//req field
	private String occupation;//opt filed
	private String[] qualifications;//opt filed
	
	public Employee(Builder builder)
	{
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.mobNo = builder.mobNo;
		this.aadharId = builder.aadharId;
		this.age = builder.age;
		this.gender = builder.gender;
		this.address = builder.address;
		this.occupation = builder.occupation;
		this.qualifications = builder.qualifications;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Long getMobNo() {
		return mobNo;
	}
	public String getAddress() {
		return address;
	}
	public Long getAadharId() {
		return aadharId;
	}
	public Integer getAge() {
		return age;
	}
	public Character getGender() {
		return gender;
	}
	public String getOccupation() {
		return occupation;
	}
	public String[] getQualification() {
		return qualifications;
	}
	
	static class Builder
	{
		private String firstName;//req field
		private String lastName;//req field
		private Long mobNo;//req field
		private String address;//opt field
		private Long aadharId;//req field
		private Integer age;//req field
		private Character gender;//req field
		private String occupation;//opt filed
		private String[] qualifications;//opt filed
		
		public Builder(String firstName, String lastName, Long mobNo, Long aadharId, Integer age, Character gender)
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.mobNo = mobNo;
			this.aadharId = aadharId;
			this.age = age;
			this.gender = gender;
		}
		public Builder addAddress(String address)
		{
			this.address = address;
			return this;
		}
		public Builder addOccupation(String occupation)
		{
			this.occupation = occupation;
			return this;
		}
		public Builder addQualifications(String[] qualifications)
		{
			this.qualifications = qualifications;
			return this;
		}
		public Employee build()
		{
			Employee emp = new Employee(this);
			
			return emp;
		}
	}
	
	
}
