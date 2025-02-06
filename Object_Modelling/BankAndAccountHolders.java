import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// bank class
class Bank {
    private String name;
    private List<Customer> customers;

    // Used to generate unique account numbers.
    private AtomicInteger accountNumberGenerator = new AtomicInteger(1000);

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // method to open a new account 
    public Account openAccount(Customer customer, double initialBalance) {
        // If the customer is new to the bank, add them to the customer list.
        if (!customers.contains(customer)) {
            customers.add(customer);
            // Also, set this bank as the customer's bank association.
            customer.setBank(this);
        }
        // Create a new account with a unique account number.
        int accountNumber = accountNumberGenerator.getAndIncrement();
        Account account = new Account(accountNumber, initialBalance, this);
        // Add the account to the customer's list of accounts.
        customer.addAccount(account);
        System.out.println("Account " + accountNumber + " opened for " + customer.getName() + " at " + name);
        return account;
    }

    public String getName() {
        return name;
    }
}

// customer class
class Customer {
    private String name;
    private Bank bank;  // The bank with which the customer has accounts.
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Method to view the balance of all accounts.
    public void viewBalances() {
        System.out.println("Balances for " + name + ":");
        for (Account account : accounts) {
            System.out.println(" - Account " + account.getAccountNumber() + " (Bank: " + account.getBank().getName() + "): $" + account.getBalance());
        }
    }

    // Add a new account to this customer's list of accounts.
    public void addAccount(Account account) {
        accounts.add(account);
    }

    public String getName() {
        return name;
    }

    // Associate this customer with a bank.
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Bank getBank() {
        return bank;
    }
}

// Represents a Bank Account.
class Account {
    private int accountNumber;
    private double balance;
    private Bank bank;  // The bank that issued this account.

    public Account(int accountNumber, double initialBalance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.bank = bank;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }

    // method to deposit money.
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " to account " + accountNumber);
        }
    }

    // a method to withdraw money.
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from account " + accountNumber);
            return true;
        } else {
            System.out.println("Withdrawal failed for account " + accountNumber);
            return false;
        }
    }
}

// main class to demonstrate association
public class BankAndAccountHolders {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("First National Bank");

        // Create customers
        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        // Customers open accounts at the bank
        bank.openAccount(alice, 500.0);  
        bank.openAccount(alice, 1500.0); 
        bank.openAccount(bob, 1000.0);   

        // Customers can view their account balances
        alice.viewBalances();
        bob.viewBalances();
       
        // Alice deposits money into her first account.
        alice.addAccount(new Account(9999, 0, bank));  // Adding a temporary account to simulate transaction (not recommended in practice)
        // In a full implementation, you would retrieve the actual account from her account list.
    }
}
