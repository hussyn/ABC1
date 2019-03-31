package a.inheritance;
//CurrentAccount allows to have negative balance.
public class CurrentAccount extends BankAccountIn {

	/**
	  * Overriding method.
	  */
	 public boolean withdraw(double amount) {
	  balance -= amount;
	  return true;
	 }
}
