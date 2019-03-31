/**
 * 
 */
package interfaces;

// Example
/*Let's assume that in an application there is a need to handle payment done through 
several modes like; cash, cheque, credit card etc. and based on the mode of the payment the functionality may be different.
This can be achieved through an interface where the interface defines a method payment and
then several classes implement that interface and provide the functionality for the 
payment method according to the business needs. That's how using interfaces, 
Java fully utilizes "one interface, multiple methods" aspect of polymorphism.
*/
public interface PaymentInterface {
	
	public void payment(double amount);

}

//Cash Payment implementation of Payment interface
class CashPayment implements PaymentInterface{
// method implementation according to cash payment functionality
public void payment(double amount) {
System.out.println("Cash Payment of amount " + amount);

}
}

//Cheque Payment implementation of Payment interface
class ChequePayment implements PaymentInterface{
// method implementation according to cheque payment functionality
public void payment(double amount) {
System.out.println("Cheque Payment of amount " + amount);  
}
}

//CreditCard Payment implementation of Payment interface
class CreditCardPayment implements PaymentInterface{
// method implementation according to credit card payment functionality
public void payment(double amount) {
System.out.println("CreditCard Payment of amount " + amount);
}
}

public class PaymentDemo2 {
	 public static void main(String[] args) {
	  // Payment interface reference holding the CashPayment obj
	  PaymentInterface paymentInt = new CashPayment();
	  paymentInt.payment(134.67);
	  // Payment interface reference holding the CreditCardPayment obj
	  paymentInt = new CreditCardPayment();
	  paymentInt.payment(2347.89);
	  // Payment interface reference holding the ChequePayment obj
	  paymentInt = new ChequePayment();
	  paymentInt.payment(1567.45);
	 }

	}