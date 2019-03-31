package oops.constructor.inheritance.polymorphism;

public class OverloadingCalculation3 {

	void sum (int a,long b) {
		
		System.out.println("method A invoked");
		
	}
	
	void sum(long a,int b) {
		
		System.out.println("method B invoked");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingCalculation3 obj=new OverloadingCalculation3();
		
		obj.sum(20, 20);//The method sum(int, long) is ambiguous for the type OverloadingCalculation3
	}

}
