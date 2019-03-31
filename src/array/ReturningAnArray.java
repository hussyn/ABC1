package array;

import org.hamcrest.core.SubstringMatcher;

public class ReturningAnArray {

	//Passing Arrays to Methods
	public static void printArray(int[] array) {
		   for (int i = 0; i < array.length; i++) {
		      System.out.print(array[i] + " ");
		   }
		}
	//Returning an Array from a Method
	public static int[] reverse(int[] list) {
		   int[] result = new int[list.length];
		 
	
		   
		   for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
		      result[j] = list[i];
		   }
		   
		   
		   for(int i=0;i<result.length;i++)
		   System.out.print(result[i]);
		   return result;
		   
		}
	
	public static void main(String[] args) {
		int []arr1= {6,5,4,3,2};
		//printArray(arr1);
		reverse(arr1);
		
	}
}
