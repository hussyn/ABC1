package a.AccessModifiers1;

import a.AccessModifiers.Addition;

public class PrivateAccessModifierTest {
//This example throws compilation error because we are trying to access the private data member and method of class ABC in the class Example. The private data member and method are only accessible within the class.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj = new Addition();  
		System.out.println(obj.num); // The field PrivateAccessModifierExample.num is not visible
		System.out.println(obj.square(10));// type PrivateAccessModifierExample is not visible
		
		
		
	}

}
