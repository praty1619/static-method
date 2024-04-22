package accountmanagement;

public class AccountManagement {

    public static void main(String[] args) {

        // Create few accounts
        Account account1 = new Account("Praty");
        Account account2 = new Account("Kartik");
        Account account3 = new Account("Rahul");

        // Display the no. of accounts created
        int numberOfAccounts = Account.getCount();
        System.out.println("Number of accounts created: " + numberOfAccounts);

        // Do the basic operations (deposit/withdraw)
        account1.deposit(1000);
        account2.deposit(2000);
        account3.deposit(3000);

        account1.withdraw(500);
        account2.withdraw(1000);
        account3.withdraw(1500);
    }

}
