package oops.encapsulation.abstraction.interface1;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank;
	    bank=new HDFC();
		
		System.out.println("Rate of interest is:"+bank.getROI()+"%");
		
	}

}
