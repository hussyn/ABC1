package a.inheritance;
/*I have modified your program to perform below operations :-

Create new account.
Select existing account.
Deposit amount.
Withdraw amount.
View balance.
Delete account.
Exit.*/
//Account.java 
/**
 * This class performs bank operations
*/
public class Account {
    private int accNumber;
    private double balance;

    public Account(double initialBalance, int accNo) {
        balance = initialBalance;
        accNumber = accNo;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccNumber() {
        return accNumber;
    }
}