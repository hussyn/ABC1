package excercise;

public class Divisible {
	public static void main(String[] args) {
		
	
		int sum = 0;
	    int count = 0;
	    
	    for (int i = 0; i <= 100; i++) {
	        if (i % 7 == 0) {
	            sum += i;
	            count++;
	        }
	    }
	    System.out.println("the average is " + sum/count);

	    System.out.println("the sum is " + sum);
}
}
