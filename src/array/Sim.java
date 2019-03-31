package array;

	import java.util.Arrays;
	import java.util.Scanner;

	public class Sim {
	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter array size: ");
	        int size = input.nextInt();

	        int[] array = new int[size];

	        // Read integers from the console
	        System.out.println("Enter array elements: ");
	        for (int i = 0; i < array.length; i++) {
	            array[i] = input.nextInt();
	        }
	        Sim s = new Sim();
	        s.find(array);
	    }

	    public void find(int[] arr) {
	        int count = 1;
	        Arrays.sort(arr);

	        for (int i = 0; i < arr.length; i++) {

	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                }
	            }
	            if (count > 1) {
	                System.out.println();
	                System.out.println("repeated element in array " + arr[i] + ": " + count + " time(s)");
	                i = i + count - 1;
	            }
	            count = 1;
	        }
	    }

	
}
