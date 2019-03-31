package Arrays;
import java.util.*;

public class ReverseAnintArray2 {
	//How to reverse an int Array in java

	
	public static void main(String[] args) {
		
		int [] arr= {2,3,4,5,6};
		String[] str= {"a","b","c","d"};
		
		Arrays.sort(str, Collections.reverseOrder());
		for(String str1:str) {
		System.out.println(str1);
		}
		for (int k=0;k<arr.length;k++) {
			//System.out.print(arr[k]);
		
		}
		
		//System.out.print(arr.length);
		for (int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		
		}
		
	}
	
}
