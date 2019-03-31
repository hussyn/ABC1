package interface1;

import interfaces.PaymentInterface;
// Cash Payment implementation of Payment interface
 class CashPayment implements PaymentInterface {

	// method implementation according to cash payment functionality
	public void payment(double amount) {
		// TODO Auto-generated method stub
		
	}
	
	//Cheque Payment implementation of Payment interface
	
	class ChequePayment implements PaymentInterface{

		public void payment(double amount) {
			
			System.out.println("ChequePayment"+amount);
			
		}
		
		
	}
	//CreditCard Payment implementation of Payment interface
	class CreditCardPayment implements PaymentInterface{

		public void payment(double amount) {
			// TODO Auto-generated method stub
			System.out.println("CreditCardPayment"+amount);
		}
		
	}
	
	//debitCard Payment implementation of Payment interface	
	class DebitcardPayment implements PaymentInterface{

	
		public void payment(double amount) {
			
			System.out.println("DebitcardPayment"+amount);
		}
		
	}
}

 public class PaymentDemo {
	 public static void main(String[] args) {
	  // Payment interface reference holding the CashPayment obj
	  PaymentInterface paymentInt = new CashPayment();
	  paymentInt.payment(134.67);
	  // Payment interface reference holding the CreditCardPayment obj
	  PaymentInterface paymentInt1 = new CreditCardPayment();
	  
	  paymentInt1.payment(2347.89);
	  // Payment interface reference holding the ChequePayment obj
	  PaymentInterface paymentInt2 = new CreditCardPayment();
	 
	  paymentInt2.payment(1567.45);
	 }
	}
 
