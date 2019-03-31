package array;

import org.testng.annotations.Test;

public class RevereArray2 {

	 public static void RevereArray(int arr1[]){
		int temp;
		for (int i = 0; i < arr1.length/2; i++) { //5/2=2
			
			 temp=arr1[i];
			 arr1[i]=arr1[arr1.length-i-1];//5-i-1=4,3,2,1
			 arr1[arr1.length-i-1]=temp;
		} 
		
		for(int i=0; i<arr1.length; i++)
			System.out.println(arr1[i]);
	}

public static void main(String[] args) {
	
	int [] arr1=new int [] {3,4,5,6,7};
	 RevereArray(arr1);
	 

}
	 
}