package array;

import java.util.Arrays;

public class ExtendAnArray {

	public static void main(String[] args) {
		
		int [] arr1=new int[] {3,4,5,6};
		int[] extended=new int [6];
		extended [4]=7;
		extended[5]=8;
		System.arraycopy(arr1, 0, extended, 0, arr1.length);
		System.out.println("Extended Array Now:"+Arrays.toString(extended));
		for (int i : extended) {
			System.out.println(i);
		}
	}
}
