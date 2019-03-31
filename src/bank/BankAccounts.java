package bank;

import java.util.Random;

public class BankAccounts {
	//data members
	private double balance;    // account balance
	private int acctNum;    // account number
	private byte acctType;    // types of account: 1 for Checking; 2 for savings
	private int currentNumberOfTransactions;    // current number of transactions per month
	private double perTransactionFlatFee;    // charge per transaction - depends on type of account

	private static Random generator = new Random(System.currentTimeMillis());    //create random number generate object

	private final static int CHECKING_MAX_NUMBER_OF_TRANSACTIONS_PER_MONTH = 5;
	private final static int SAVINGS_MAX_NUMBER_OF_TRANSACTIONS_PER_MONTH = 2;

	/**
	 * default constructor - initializes account balance and account number
	 */
	private BankAccounts(){
	    balance = 0.0;        // initialize account balance

	    // generate random number accordingly and assign to account number
	    acctNum = generator.nextInt(1000) + 9999;    
	    currentNumberOfTransactions = 0;    // initialize 
	    perTransactionFlatFee = 0.0;        // initialize    
	}

	/**
	 * constructor with current balance; initialize account number
	 * @param balance    initial account balance
	 * @param type        type of account (1 for Checking; 2 for Savings)
	 */
	    public BankAccounts(double balance, byte type, int acctNum){
	        this();    // use default constructor

	        this.balance = balance;    // set initial balance
	        acctType = type;        // set account type

	        switch (type){
	        case 1:    perTransactionFlatFee = 0.10; break;
	        case 2: perTransactionFlatFee = 0.20; break;
	        }
	    }

	/**
	 * constructor with account number; initialize balance
	 * @param type    type of account (1 for Checking; 2 for Savings)
	 */
	    public BankAccounts(byte type){
	        this();    // use default constructor

	        acctType = type;        // set account type

	        switch (type){
	        case 1:    perTransactionFlatFee = 0.10; break;
	        case 2: perTransactionFlatFee = 0.20; break;
	        }

	    }


	/**
	 * getter to return current balance        
	 * @return    current account balance
	 */
	public double getBalance() {
	    return balance;
	}

	/**
	 * deposit into account
	 * @param amount    amount to deposit; not more than 10,000
	 * @return            true or false
	 */
	public void deposit(double amount){
	    // deposit amount - deduct per transaction fee based on type of account

	}

	/**
	 * withdraw from account
	 * @param amount    amount to withdraw; not more than 10,000
	 * @return            true or false
	 */
	public void withdraw(double amount) {
	    // withdraw amount - deduct per transaction fee based on type of account

	}


	private String getAcctType() {
	    String ret = "";

	    switch(acctType){
	    case 1: ret = "Checking"; break;
	    case 2: ret =  "Savings"; break;
	    }

	    return ret;
	}

	/**
	 * Resets the current number of transactions to 0
	 * @param bankAccount    Account to reset current number of transactions
	 */

	public static void reSetAccount(BankAccounts bankAccount){
	    bankAccount.currentNumberOfTransactions = 0;
	}

	/**
	 * Deducts the applicable monthly charges from the account balance.
	 *             May lead to negative balance.
	 * @param bankAccount    Account to apply the monthly charge
	 * @param chargeAmt        Amount to charge if maximum allowable transactions have been exceeded
	 */

	public static void deductMonthlyCharges(BankAccounts bankAccount, double chargeAmt){
	   // deduct from balance the chargeAmt if applicable maximum allowable transactions have been exceeded
	        balance = (balance-chargeAmt);


	    // reset current number of transactions
	        //add my code here


	    System.out.println("\n\nCharges applied successfully.");
	}

	/**
	 * Prints an account information - Account number, type, balance, and current number of transactions
	 */
	public void print(){
	    System.out.println("\n\nAccount Number: " + acctNum  + "\nAccount Type: " + getAcctType() + 
	                "\nBalance: " + balance + "\nCurrent Number of Transactions: " + currentNumberOfTransactions);
	}




}	

