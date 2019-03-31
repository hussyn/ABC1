package array;

public class LeftRotateArray {

	public static void main(String[] args) {
		// int [] arr = new int [] {1, 2, 3, 4, 5}; 
		int [] arr1= {1,2,3,4,5};
		//output={2,3,4,5,1}; shift elements by one postion left
		int i,j, temp;
		
	
		for( i=0;i<3;i++) {
			 temp = arr1[0];
			 for( j=0;j<arr1.length-1;j++) {
				 
				 arr1[j]=arr1[j+1];
				 //System.out.println(arr1[j]);
				 }
			
			arr1[j]=temp;
		
			System.out.println(arr1[j]);
		}
		
	 
		for( i=0;i<arr1.length;i++) {
		    //System.out.println(arr1[i]);
			}

	}

}
