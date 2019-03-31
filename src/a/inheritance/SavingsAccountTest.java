package a.inheritance;
//A Java program that creates a Bank Account with withdraw, deposit, and intrest functions. And a test class, that tests the SavingsAccount class.
public class SavingsAccountTest {
	
		public static void main(String[] args)
		{
			SavingsAccount Savings = new SavingsAccount(1000, 0.10);
			Savings.withdraw(250);
			Savings.deposit(400);
			Savings.addInterest();
			System.out.println(Savings.getBalance());
			System.out.println("Expected: 1265.0");
			//1000-250=750 => 750+400=1150 => 1150+1150*0.10=1265.0
		}
}
