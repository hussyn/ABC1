package a.Methods;
/**
 * A class to test the {@code CashRegister} class.
 */
public class CashRegisterTest {
	
	    public static void main(String[] args)
	    {
	        CashRegister register = new CashRegister(10);

	        register.recordTaxablePurchase(29.50);
	        register.recordTaxablePurchase(10.50);
	        register.receivePayment(50);

	        double taxablePurchase = register.getTotalTax();
	        double change = register.giveChange();

	        System.out.println("Change due: $" + change);
	        System.out.println("Tax total: $" + taxablePurchase);
	    }
}
