package array;

public class CopyArray1to2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Arr1= {1,2,3,4,5};
		int[] Arr2= {6,7,8,9,10};
		int counter = 0;
		int[] result=new int [Arr1.length+Arr2.length];
		
		
		
		//System.arraycopy(Arr1, Arr1.length-1, arr2, 0, Arr1.length-1);
		
		for(int i=0;i<Arr1.length;i++) {
			result[i]=Arr1[i];
			counter++;
			//System.out.println(result.length);
		}
		
		for(int j=0;j<Arr2.length;j++) {
			System.out.println("counter"+counter);
			result[counter]=Arr2[j];
			counter++;
		
		}
		
		System.out.println("new array");
		for(int i=0;i<result.length;i++) {
			//arr2[i]=arr1[i];
	
		System.out.println(result[i]);
				//System.out.println(result.length);
		}

	}

}
