package bank;

public class TestAccount2 {
public static void main(String[] args) {
	
	 Account2 acct = new Account2();
     System.out.println("Current balance : " + acct.balance());
     System.out.println("Withdrawing $200");
     acct.withdraw(200);
     System.out.println("Current balance : " + acct.balance());
     acct.withdraw(3500);
}
}