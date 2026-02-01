class BankAccount {
    String accountHolder;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited. Current Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance = balance - amount;
            System.out.println(amount + " withdrawn. Remaining: " + balance);
        }
    }
}

public class BankingApp {
    public static void main(String[] args) {
        BankAccount myAcct = new BankAccount();
        myAcct.accountHolder = "John Doe";
        myAcct.balance = 500.0;

        myAcct.deposit(200);   // Balance becomes 700
        myAcct.withdraw(100);  // Balance becomes 600
        myAcct.withdraw(1000); // Triggers error message
    }
}