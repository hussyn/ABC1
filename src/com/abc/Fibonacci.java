package com.abc;

public class Fibonacci {

	public static int fibonacci(int number)
	{ if(number == 1 || number == 2)
	{ return 1; } 
	return fibonacci(number-1) + fibonacci(number -2); //tail recursion }

	
		// TODO Auto-generated method stub

	}

}
