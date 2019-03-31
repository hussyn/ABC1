package bank;

public class Checking extends Account {

    double overdraftLimit = 5000;

    public void withdraw (double w) {

        if (balance - w < overdraftLimit) {
            System.out.println("The exceeds the overdraft limit of $5000");
        } else {
            super.withdraw(w);
        }
    } // End of withdraw method

} // End of Checking.

Account sa = new Account(accountNumber, accountBalance, interestRate);
Account sa = new Checking(accountNumber, accountBalance, interestRate);