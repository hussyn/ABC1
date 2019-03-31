package Arrays;

public class MergeArraySample {
//How to merge two sorted array and final array should be in descending order with O(n) performance.
//There two integer array int a[] = {12,45,67,89,100} and int b[]={1,13,46,65,88,90,101} and resulted array would be int result[]={101,100,90,89,88,67,65,46,45,13,12,1}

	  public static void main(String[] args) {
	  int a[] = {12,45,67,89,100};    // array 1st
	  int b[] = {1,13,46,65,88,90,101}; // array 2nd
	  int len = a.length+b.length;  //  result array
	  int result [] = new int[len];
	  int i=0,j=0;  //  intialize counter to traverse 1st and 2nd array
	  int k= len-1;
	  while(i<a.length || j<b.length) {
	   if(i<a.length && j<b.length) {  // compare logic
	    if(a[i]<b[j]) {
	     result[k] = a[i];
	     i++;
	    } else {
	     result[k] = b[j];
	     j++;
	    }
	   } else if(i<a.length){
		   result[k] = a[i];
		    i++;
		   } else {
		    result[k] = b[j];
		    j++;
		   }
		   k--;
		  }
		  for(int v: result) {
		   System.out.print(v+",");
		  }
		 }

	   }