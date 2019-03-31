package Arrays;

import java.util.Arrays;

public class ArraysCopy {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] creditCards = {"Chase Sapphire Card", "Freedom Unlimited", "Amex Credit Card", "Citi Simplicity Card ", "Blue Cash Card from American Express ", "NASCAR Credit Card"}; 
		// let's copy this String array into another 
		String[] bestCreditCards = Arrays.copyOf(creditCards, creditCards.length); 
		System.out.println("original array: " + Arrays.toString(creditCards)); 
		System.out.println("copy of array: " + Arrays.toString(bestCreditCards));
	}

}
