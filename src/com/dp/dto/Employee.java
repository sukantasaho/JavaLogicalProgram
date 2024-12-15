package com.dp.dto;

public class Employee {

	private String name;
	private String addr;
	private Double sal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "{\"name\":\"" + name + "\",\"addr\":\"" + addr + "\",\"sal\":" + sal + "}";
	}
	
	 
	
}
