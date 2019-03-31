package a.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToStringTest extends ArrayListToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        //declaration and initialise ArrayList 
	        ArrayList<String> a1 = new ArrayList<String>();

	        a1.add("Geeks"); 
	        a1.add("for"); 
	        a1.add("Geeks"); 
	  
	        // print ArrayList 
	        System.out.println("ArrayList: " + a1); 
	  
	        // Get String Array 
	        String[] str = GetStringArray(a1); 
	  
	        // Print Array elements 
	        System.out.print("String Array[]: "+ Arrays.toString(str)); 
	                         
	    } 

}
