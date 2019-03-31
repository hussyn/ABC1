package encapsulation;

public interface IPayment {
	 void doPayment(double amount);
	}

public class CashPayment implements IPayment {

	 @Override
	 public void doPayment(double amount) {
	  System.out.println("Cash payment " + amount);
	  
	 }
	}
public class CreditCardPayment implements IPayment {

	 @Override
	 public void doPayment(double amount) {
	  System.out.println("CreditCard payment " + amount);

	 }

	}

public class Payment {
	 private static final String CASH = "CASH";
	 private static final String CC = "CC";
	 public static void main(String[] args) {
	  Payment payment = new Payment();
	  payment.executePayment(CASH, 34.45);
	  payment.executePayment(CC, 34.45);
	  

	 }
	 
	 private void executePayment(String mode, double amount){
	  IPayment payRef;
	  // If payment is in CASH
	  if(mode.equalsIgnoreCase(CASH)){
	   payRef = new CashPayment();
	   payRef.doPayment(amount);
	   
	  }
	  // If payment is through credit card
	  else if(mode.equalsIgnoreCase(CC)){
	   payRef = new CreditCardPayment();
	   payRef.doPayment(129.78);
	  }
	 }

	}