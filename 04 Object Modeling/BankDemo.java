import java.util.ArrayList;
import java.util.List;
class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    @Override
    public String toString() {
        return "Account{Account Number='" + accountNumber + "', Balance=" + balance + "}";
    }
}

class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
class Bank {
    private String bankName;
    private List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, Account account) {
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened in " + bankName + " for " + customer.getName());
    }

    public void showCustomers() {
        System.out.println("Bank: " + bankName);
        for (Customer customer : customers) {
            customer.viewBalance();
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {

        Bank bank = new Bank("Global Bank");

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        Account account1 = new Account("101", 5000);
        Account account2 = new Account("102", 10000);
        Account account3 = new Account("103", 7500);

        bank.openAccount(customer1, account1);
        bank.openAccount(customer1, account2);
        bank.openAccount(customer2, account3);

        bank.showCustomers();
    }
}
