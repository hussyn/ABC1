package a.interfaces;

public class BankAccount implements BankAccountSpecification { 
	  private int balance;  

	  public BankAccount() { balance = 0; }                     // constructor

	  public boolean deposit(int amount) {
	    boolean res = false;
	    if ( amount >= 0 ) { balance = balance + amount; res = true; };
	    return res;
	  }
	  public boolean withdraw(int amount) {
	    boolean res = false;
	    if ( amount <= balance ) { balance = balance - amount; res = true; }
	    return res;
	  }
	  public int getBalance() {
	    return balance; }
}

//---------------------------------------------------------------------------
//static is required because it is used in a static context (that is, main)
static class MortgagePaymentCalculator {                 
private BankAccountSpecification account;  
                                                         // constructor
public MortgagePaymentCalculator(BankAccountSpecification account) {
 this.account = account; }
/**
* any object of a class which implements the BankAccountSpecification 
* interface can be an argument of the class MortgagePaymentCalculator. 
* That object will be a private field of the class MortgagePaymentCalculator.
*
* In order to write the methods of the class MortgagePaymentCalculator 
* one need to know the type of the interface BankAccountSpecification
* (that is, the type of the methods of any object of any class which
* implements the BankAccountSpecification interface), but one need not know
* the details of how that interface is implemented by a concrete class (in
* case the concrete class BankAccount).
* This is example of the "Programming to Interfaces" paradigm (Dave Schmidt).
*/

public boolean makeMortgagePayment(int amount) {
 boolean ok = account.withdraw(amount);
 if ( ok )
    { System.out.println("  Payment made: $ " + amount); }
 else { System.out.println("Error in makeMortgagePayment!"); };
 return ok;
}

public boolean makeMortgageRefund(int amount) {
 boolean ok = account.deposit(amount);
 if ( ok )
    { System.out.println("  Refund  made: $ " + amount); }
 else { System.out.println("Error in makeMortgageRefund!"); };
 return ok;
}

//---------------------------------------------------------------------------
public static void main (String[] args) {
BankAccount acc = new BankAccount();
acc.deposit(300);
System.out.println("Initial Balance:  $ " + acc.getBalance());
acc.withdraw(100);

MortgagePaymentCalculator mPC = new MortgagePaymentCalculator(acc);
/**
* acc is an object of the class BankAccount which is a class implementing 
* the BankAccountSpecification interface.
* Thus, acc can be an argument of the class MortgagePaymentCalculator. 
*/

//* One such object is acc which is of the class BankAccount.

System.out.println("Balance:  $ " + acc.getBalance());
int m = 0; 
boolean goOn = true;
while ( (m <= 6) && goOn ) {                 // at most 6 mortgage payments
   m++; 
   if ( !mPC.makeMortgagePayment(50) ) { goOn = false; m--; };
   if ( (m%3 == 2) && goOn ) { mPC.makeMortgageRefund(10); };
};
System.out.println("Successful mortgage payment(s): "+ m);
System.out.println("Current balance: $ " + acc.getBalance());
}
}
