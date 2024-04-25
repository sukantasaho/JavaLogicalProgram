package com.dp.startegyDP;

public class StartegyDP {

	public static void main(String[] args) {
		 
       Customer customer1 = new Customer(new PreferredCustomer());
       customer1.showIntrestRate();
       
       Customer customer2 = new Customer(new RegularCustomer());
       customer2.showIntrestRate();
       
	}

}
interface CustomerType
{
	public void intrestRate();
}
class PreferredCustomer implements CustomerType
{
	@Override
	public void intrestRate() {
		 System.out.println("Intrest Rate is 9.7%");
		
	}
}
class RegularCustomer implements CustomerType
{
	@Override
	public void intrestRate() {
		 
		System.out.println("Intrest Rate is 10%");
	}
}
class Customer 
{
	private CustomerType customerType;
	public Customer(CustomerType customerType) {
		 this.customerType = customerType;
	}
	public void showIntrestRate()
	{
		customerType.intrestRate();
	}
}
