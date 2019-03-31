package array;

import java.util.Arrays;

public class SortAnArrayAndSearch {

	public static void main(String[] args) {
		
		//How to compare Two arrays?
		int arr1[] = {1, 2, 3};
	     int arr2[] = {1, 2, 3};
	     
	     if(arr1==arr2) 
	    	 System.out.println("arrays same");
	     else
	    	 System.out.println("arrays not same"); 
	     
	     if(arr1.equals(arr2))
	    	 System.out.println("arrays same");
	     else
	    	 System.out.println("arrays not same");
	     
	     if(Arrays.equals(arr1, arr2))//In other words, two arrays are equal if they contain the same elements in the same order. Also, two array references are considered equal if both are null
	    	 System.out.println("arrays same");
	     else
	    	 System.out.println("arrays not same");
	    	 
	}

}
