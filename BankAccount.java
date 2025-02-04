class BankAccount{
	//static variable
	static String bankName = "AXIS Bank";
	private static int totalAccount = 0;

	//instance variable
	private String accountHolderName;
	private final long accountNumber;

	//constructor
	BankAccount(String accountHolderName, long accountNumber){
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		totalAccount++;
	}

	public static int getTotalAccount(){
		return totalAccount;
	}

	public void display(){
		if(this instanceof BankAccount){
			System.out.println("Account is the instace of Bank Account");
			System.out.println("===Bank Details===");
			System.out.println("Bank Name: "+ bankName);
			System.out.println("Account holder Name: "+ accountHolderName);
			System.out.println("Account Number: " + accountNumber);
		}
		else{
			System.out.println("Account is not the instace of of Bank Account");
		}
	}

	public static void main(String args[]){
		BankAccount acc1 = new BankAccount("Muskan", 1234567);
		BankAccount acc2 = new BankAccount("Mansi", 2345678);

		acc1.display();
		System.out.println();
		acc2.display();

		System.out.println("Total Accounts " + getTotalAccount());
	}
}
