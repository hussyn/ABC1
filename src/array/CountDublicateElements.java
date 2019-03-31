package array;

public class CountDublicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1= {5,2,3,4,6,2,3,5,5};
		
		int len = arr1.length;
		for(int i=0;i<len;i++) {
		
			
			for(int j=i+1;j<len;j++) 
			{
				
				if(arr1[i]==arr1[j]) 
					
					System.out.println(arr1[i]+"");
			
			}
			
		} 

	}

}
