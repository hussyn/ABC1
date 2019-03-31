package array;

public class EvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5};   
		//output{2,4}
		
		for(int i=1;i<arr.length;i=i+2) {
			
			System.out.println("i"+i);
			System.out.println(arr[i]);}
		}
	

}
