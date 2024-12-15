package com.sahoo.streamAPI;

public class Products {
	
	String name;
	double price;
	String category;
	
	
	public Products(String name, double price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Products [name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
	
	

}
