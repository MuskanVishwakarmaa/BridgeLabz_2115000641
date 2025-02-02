class BankAccount{
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void displayAccountDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount{

    public SavingsAccount(int accountNumber, String accountHolder, double balance){
        super(accountNumber, accountHolder, balance);
    }

    public void displaySavingsAccountDetails(){
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

public class BankAccountManagementSystem{
    public static void main(String[] args){
        BankAccount account1 = new BankAccount(101, "Muskan", 50000);
        account1.displayAccountDetails();

        account1.setBalance(6000);
        System.out.println("\nAfter updating balance:");
        account1.displayAccountDetails();

        SavingsAccount savingsAccount1 = new SavingsAccount(102, "Priya", 60000);
        savingsAccount1.displaySavingsAccountDetails();
    }
}
