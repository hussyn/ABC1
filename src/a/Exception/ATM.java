package a.Exception;

public class ATM {   
	    // Create instance variables
	    
	    private String accountNumber, firstName, lastName;
	    private Double accountBalance;
	    double balance;
	    // initializing constructor
	    
	    public ATM ()
	    {
	    accountNumber = "";
	    firstName = "";
	    lastName = "";
	    accountBalance = 0.0;
	    }
	    // set
	    
	    public void setAccountNumber (String account)
	    {
	    accountNumber = account;
	    }
	    //get
	    public String getAccountNumber()
	    {
	    return accountNumber;
	    }
	    // set
	    
	    public void setFirstName(String first)
	    {
	    firstName = first;
	    }
	    // get
	    public String getFirstName()
	    {
	    return firstName;
	    }
	    // set
	    public void setLastName(String last)
	    {
	    lastName = last;
	    }
	    // get
	    public String getLastName()
	    {
	    return lastName;
	    }
	    // set
	    public void setAccountBalance(double balance)
	    {
	    accountBalance = balance;
	    }
	    // get
	    public double getAccountBalance()
	    {
	    return accountBalance;
	    }
	    // Inital Balance
	    public void setInitialBalance(double initialBalance)
	    {
	    if (initialBalance > 0.0)
	            accountBalance = initialBalance;
	    }
	    public void withdrawal(double newBalance, double amount)
	    {
	    newBalance = accountBalance - amount;
	    System.out.println("You withdrew: " + amount);
	    System.out.println("Your balance is: " + newBalance);
	    }

	    // Deposit

	    public void deposit (double newBalance, double amount)
	    {
	    newBalance = accountBalance + amount;
	    System.out.println("You gave me: $ " + amount);
	    System.out.println("I now have all your money that is worth: " + newBalance);
	    }

	    private Double withdrawal(int amount)
	    {
	    double withdrawal;
	   
	    balance = balance - amount;
	    return balance;
	    }

	    private Double deposit(int amount)
	    {
	    double deposit;
	    balance = balance + amount;
	    return balance;
	    }
	   
	

}