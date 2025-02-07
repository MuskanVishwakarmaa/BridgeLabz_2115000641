//Superclass
class BankAccount{
    String accountNumber;
    double balance;

    //Constructor
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //Method to display balance
    public void displayBalance(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Subclass
class SavingsAccount extends BankAccount{
    double interestRate;

    //Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType(){
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass
class CheckingAccount extends BankAccount{
    double withdrawalLimit;

    //Constructor
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit){
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType(){
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

// Subclass
class FixedDepositAccount extends BankAccount {
    int termInYears;

    // Constructor
    public FixedDepositAccount(String accountNumber, double balance, int termInYears){
        super(accountNumber, balance);
        this.termInYears = termInYears;
    }

    public void displayAccountType(){
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Term: " + termInYears + " years");
    }
}

//Main Class
class BankAccountTypes{
    public static void main(String[] args){
		
        // Creating objects
        SavingsAccount savings = new SavingsAccount("SA123", 5000, 4.5);
        CheckingAccount checking = new CheckingAccount("CA456", 3000, 1000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD789", 10000, 5);

        // Display account details
        savings.displayBalance();
        savings.displayAccountType();
        System.out.println();

        checking.displayBalance();
        checking.displayAccountType();
        System.out.println();

        fixedDeposit.displayBalance();
        fixedDeposit.displayAccountType();
    }
}
