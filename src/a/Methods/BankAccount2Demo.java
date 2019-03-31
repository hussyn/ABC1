package a.Methods;


	/**
	 * Demo of the {@code BankAccount} class.
	 */
public class BankAccount2Demo {
	
	    public static void main(String[] args)
	    {
	        BankAccount2 bankAccount = new BankAccount2(1000);

	        bankAccount.deposit(100, 10);
	        System.out.print("The balance after deposit: ");
	        System.out.println(bankAccount.getBalance());

	        bankAccount.deposit(100, 10);
	        System.out.print("The balance after deposit: ");
	        System.out.println(bankAccount.getBalance());

	        bankAccount.deposit(100, 10);
	        System.out.print("The balance after deposit: ");
	        System.out.println(bankAccount.getBalance());

	        bankAccount.deposit(100, 10);
	        System.out.print("The balance after deposit: ");
	        System.out.println(bankAccount.getBalance());

	        bankAccount.deposit(100, 10);
	        System.out.print("The balance after deposit: ");
	        System.out.println(bankAccount.getBalance());

	        bankAccount.withdraw(100, 10);
	        System.out.print("The balance after withdrawal: ");
	        System.out.println(bankAccount.getBalance());

	        bankAccount.deductMonthlyCharge(3, 10);
	        System.out.print("The balance after deducting monthly charge: ");
	        System.out.println(bankAccount.getBalance());
	    }
	
}
