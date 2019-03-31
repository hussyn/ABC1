package a.Methods;

public class BankAccountt {

	 
		public static void main(String[] args){ 
		System.out.println("Welcome to the bank! What do you want to do?"); 

		} 
		public double balance = 0.0; 
		public int deposits = 0; 
		public double withDrawals = 0; 
		public double annualInterestRate = 0; 
		public double serviceCharge = 1; 



		// The constructor to hold balance and Annual Interest Rate 
		public double accountBalance(double bal, double intRate) 
		{ 
		balance = bal; 
		annualInterestRate = intRate; 
		return balance; 
		} 

		public void deposit(double amount) 
		{ 
		balance +=amount; 
		deposits++; 

		} 
		public void withDrawal(double amount) 
		{ 
		balance -= amount; 
		withDrawals++; 
		} 

		private void calcInterest() 
		{ 
		double monthlyInterestRate; 
		double monthlyInterest; 

		monthlyInterestRate = (annualInterestRate / 12); 
		monthlyInterest = balance * monthlyInterestRate; 
		balance = balance + monthlyInterest; 
		} 

		protected void monthlyProcess() 
		{ 
		balance -= serviceCharge; 
		calcInterest(); 
		withDrawals = 0; 
		deposits = 0; 
		serviceCharge = 0; 
		} 

		public double getBalance() 
		{ 
		return balance; 
		} 

		} 

		And then the SavingAccount 
		public class SavingsAccount extends BankAccount 
		{ 


		public SavingsAccount(double balance, double annualInterestRate) 
		{ 
		super(); 

		} 

		public void withDrawal(double amount) 
		{ 
		if(balance >= 25) 
		super.withDrawal(amount); 
		else 
		System.out.println("Your account is inactive. Your balance needs to be over $25." ); 
		} 

		public void deposit(double amount) 
		{ 
		if(balance >= 25) 
		super.deposit(amount); 
		else 
		System.out.println("Your account is inactive. Your balance needs to be over $25." ); 
		} 

		protected void monthlyProcess() 
		{ 
		if(withDrawals > 4) 
		serviceCharge++; 
		else; 
		} 
		} 
}
