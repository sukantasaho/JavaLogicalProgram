package CoreJPratice;

public class Test {
	
	public static void main(String[] args) {
		
		BankAccount ac = new BankAccount();
		
		ac.setAccountNumber(1700003457);
		ac.setAccHolderName("Rakesh Sahoo");
		ac.setAddress("Bhadrak");
		ac.setTypeAccount("Saveing");
		
		
		System.out.println(BankAccount.getBankName());
		System.out.println("AccountNumber: "+ac.getAccountNumber());
		System.out.println("Account_Holder_Name: "+ac.getAccHolderName());
		System.out.println("Address: "+ac.getAddress());
		System.out.println("AccountType: "+ac.getTypeAccount());
		String msg1 = ac.deposit(3000);
		System.out.println(msg1);
		System.out.println(ac.balanceInquiry());
		System.out.println(ac.withdraw(2000));
		System.out.println(ac.balanceInquiry());
		String msg2 = ac.deposit(30000);
		System.out.println(ac.balanceInquiry());
		System.out.println(ac.withdraw(32000));
		System.out.println(ac.balanceInquiry());
		
			
		
	}
}
