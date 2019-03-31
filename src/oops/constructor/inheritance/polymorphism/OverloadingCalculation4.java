package oops.constructor.inheritance.polymorphism;

public class OverloadingCalculation4 {

	static int  sum(int a,int b) {//Duplicate method sum(int, int) in type OverloadingCalculation4
		return a+b;//Type mismatch: cannot convert from long to int if return type int
		
	}
	
	 static double sum(int a,int b) {//Duplicate method sum(int, int) in type OverloadingCalculation4
		return a+b;
		
	}
	public static void main(String[] args) {
	
		
		//System.out.println(OverloadingCalculation4.sum(10.00, 10.00));
		
	}

}
