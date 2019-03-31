package Arrays;


public class SortAsc {
	//How to reverse an int Array in java ascending
			//Let understand the question through the example :
			//Input    : {3, 8, 5, 7, 4}
			//Output : {4, 7, 5, 8, 3}
	
	public static void main(String[] args) {
		
		int [] arr= {8,3,9,5,6};

		int temp=0;
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
		
		if (arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	
		}
		}
		
		
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
}
