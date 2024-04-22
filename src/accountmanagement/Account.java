package accountmanagement;

public class Account {

    private long accountNo;
    private String customerName;
    private double balance;
    private static int count = 0; // Static variable to keep track of the number of accounts created

    // Constructor
    public Account(String customerName) {
        this.customerName = customerName;
        count++; // Increment count whenever a new account is created
    }

    // Getters and Setters

    public static int getCount() {
        return count;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into account. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from account. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void showAccountInfo() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
    }
}
