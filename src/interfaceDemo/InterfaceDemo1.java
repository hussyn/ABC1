package interfaceDemo;

import interfaces.PaymentInterface;

public class InterfaceDemo1 {

	public static void main(String[] args) {
		
		// Payment interface reference holding the CashPayment obj
		PaymentInterface Payint=new CashPayment();
	}

}
