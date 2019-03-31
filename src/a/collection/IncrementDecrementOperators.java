package a.collection;

public class IncrementDecrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		       int value = 5;

		       System.out.println("Initial Value  =  " + value);

		       System.out.println("Value after prefix increment =  " + ++value);
		       System.out.println("Value after postfix increment =  " + value++);

		       System.out.println("Value after after increment operations =  " + value);//7

		       System.out.println("Value after prefix decrement =  " + --value);
		       System.out.println("Value after postfix dencrement =  " + value--);//6

		       System.out.println("Value after after decrement operations =  " + value);//5
	}

}}
