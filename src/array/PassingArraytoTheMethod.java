package array;

public class PassingArraytoTheMethod {

	////creating a method which receives an array as a parameter 
		public void getMinValue_passingArray(int Arr[]) {
			int min=Arr[0];
			for(int i=0;i<Arr.length;i++) 
				
				if(min>Arr[i]) 	
					min=Arr[i];
					System.out.println(min);
			
		}
		
		
		public static void main(String[] args) {
			PassingArraytoTheMethod obj=new PassingArraytoTheMethod();
			int[] arr1= {3,4,5,6,7};
			obj.getMinValue_passingArray(arr1);////passing array to method  
			
			
	}

}
