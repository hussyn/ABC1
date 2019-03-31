package a.AccessModifiers;

public class Addition {
	
	  int addTwoNumbers2(int a, int b){// Since we didn't mention any access modifier here, it would be considered as default.
		return a+b;
		   }
	 
	public int addTwoNumbers(int a,int b) {//this time the method addTwoNumbers() has public modifier and class Test is able to access this method without even extending the Addition class. This is because public modifier has visibility everywhere.
		return a+b;
		
	}
	
	protected int subtracttwoNumbers(int a,int b) {
		
		return a-b ;
	}

	private double num = 100;
	
	   private int square(int a){
		return a*a;
	   }
	   
	 protected int addTwoNumbers1(int a, int b){
		return a+b;
		   }

}
