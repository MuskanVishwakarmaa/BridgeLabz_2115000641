import java.util.ArrayList;
import java.util.List;

// Interface for loanable accounts
interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}

// Abstract class BankAccount
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holderName + " deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(holderName + " withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Abstract method for interest calculation
    public abstract double calculateInterest();

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Earned: $" + calculateInterest());
    }

    // Getters
    public double getBalance() { return balance; }
    public String getHolderName() { return holderName; }
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04; // 4% annual interest

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " applied for a loan of $" + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5; // Loan eligibility is 5 times the balance
    }
}

// CurrentAccount subclass
class CurrentAccount extends BankAccount {
    private double overdraftLimit = 5000;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for current accounts
    }
}

// Main class
public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        SavingsAccount acc1 = new SavingsAccount("12345", "Muskan", 10000);
        CurrentAccount acc2 = new CurrentAccount("67890", "Mansi", 5000);

        accounts.add(acc1);
        accounts.add(acc2);

        // Display account details and interest
        for (BankAccount acc : accounts) {
            acc.displayAccountDetails();
            System.out.println("------------------------");
        }

        // Loan processing
        acc1.applyForLoan(20000);
        System.out.println("Loan eligibility: $" + acc1.calculateLoanEligibility());
    }
}
