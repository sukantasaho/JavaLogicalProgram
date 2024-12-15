package CoreJPratice;

public class BankAccount {
	public static String BankName="Welcome to HDFC Bank";
	private long accountNumber;
	private String accHolderName;
	private String address;
	private String typeAccount;
	private double balance;
	
	
	public BankAccount() {
	}
	public BankAccount(long accountNumber, String accHolderName, String address, String typeAccount,String BankName) {
		 
		this.accountNumber = accountNumber;
		this.accHolderName = accHolderName;
		this.address = address;
		this.typeAccount = typeAccount;
		this.BankName= BankName;
		
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
 
	public String getAddress() {
		return address;
	}

	public static String getBankName() {
		return BankName;
	}
	public static void setBankName(String bankName) {
		BankName = bankName;
	}
	public void setAddress(String address ) {
		this.address = address;
		
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getTypeAccount() {
		return typeAccount;
	}
	public void setTypeAccount(String typeAccount) {
		this.typeAccount = typeAccount;
	}

	public String deposit(double amount) {
		this.balance = this.balance+amount;
		return "Your amount of "+amount+" is successfully credited";
	}
	public String withdraw(double amount) {
		 this.balance = this.balance-amount;
		 
		 return "Please receive your withdraw amount-"+amount;
		
	}
	public String balanceInquiry() {
		return "Your available balance is-"+this.balance;
	}
	public static String getBankName1() {
		// TODO Auto-generated method stub
		return null;
	}
	
}




	


	
	
	
	
	
	  

	
	
	

	



