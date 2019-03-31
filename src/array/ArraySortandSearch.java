package array;

import java.util.Arrays;

public class ArraySortandSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int found=4;
		int [] arr1=new int [] {2,3,4,7,3,8,1};
		Arrays.sort(arr1);
		//System.out.println(arr1);
		for(int i=0; i<arr1.length;i++) {
			if(arr1[i]==found) {
			System.out.println(arr1[i]);
			break;
			}
		}
	}

}
