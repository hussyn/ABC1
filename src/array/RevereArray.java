package array;

public class RevereArray {

	

public static void main(String[] args) {
	
	int [] arr1=new int [] {3,4,5,6,7};
	
	int temp;
	for(int i=0; i<arr1.length/2; i++)
	{ 
		
		//int[] array;
		temp = arr1[i]; 
		arr1[i] = arr1[arr1.length -i -1]; 
		arr1[arr1.length -i -1] = temp; 
	}
	
	for(int i=0; i<arr1.length; i++)
	System.out.println(arr1[i]);
}
	 
}