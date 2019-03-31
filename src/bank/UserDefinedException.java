package bank;

public class UserDefinedException {
	 public static void main(String args[]) { 
	Account acct = new Account(); 
	System.out.println("Current balance : " + acct.balance()); 
	System.out.println("Withdrawing $200"); acct.withdraw(200); 
	System.out.println("Current balance : " + acct.balance()); 
	acct.withdraw(1000); } 
	 } 
/** * Java class to represent a Bank account which holds your balance and provide wi */ 
	public class Account { private int balance = 1000; 
	public int balance() { return balance; } 
	public void withdraw(int amount) throws NotSufficientFundException { 
	if (amount > balance) { throw new NotSufficientFundException(String.format("Current balance %d is less than requested amount %d", balance, amount)); } balance = balance - amount; } 
	public void deposit(int amount) { if (amount <= 0) { throw new IllegalArgumentException(String.format("Invalid deposit amount %s", amount)); } } } /** * User defined Exception class in Java */ 
	
	public class NotSufficientFundException extends RuntimeException { 
	private String message;public NotSufficientFundException(String message) { this.message = message; } 
	public NotSufficientFundException(Throwable cause, String message) { super(cause); this.message = message; } 
	public String getMessage() { return message; } } 
