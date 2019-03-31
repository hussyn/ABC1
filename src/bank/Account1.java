package bank;
//Deposit And Withdraw Method
//I am trying to make a 2 methods that with deposit a certain amount into an account and on that will withdraw a certain amount.
public class Account1 {

	private int Id=0;
	private double balance=0, annualInterestRate;

	/**
	* precondition: Id cannot be negative
	* precondition: Balance cannot be negative
	* precondition: AnnualInterestRate cannot be negative
	* @param Id2 is Id number 
	* @param iBalance is balance of account
	*/
	public Account1 (int Id2, double iBalance){
	if (Id < 0){
	throw new IllegalArgumentException("Id num cannot be negative");
	}
	if (balance < 0){
	throw new IllegalArgumentException("Balance cannot be negative");
	}
	if (annualInterestRate < 0){
	throw new IllegalArgumentException("Annual Interest Rate cannot be negative");
	}

	Id=Id2;
	balance=iBalance;
	}
	public void setId(int Id){
	this.Id=Id;
	}
	public void setannualInterestRate(double annualInterestRate){
	this.annualInterestRate=annualInterestRate;
	}
	public int getId(){
	return Id;
	}
	public double getAnnualInterestRate(){
	return annualInterestRate;
	}
	public double getBalance(){
	return balance;
	}
	public double getMonthlyInterestRate(){
	double monthlyInterestRate = annualInterestRate / 2; 
	return monthlyInterestRate;	
	}
	public void Deposit(){

	}
	public void Withdraw(){

	}
	
}
