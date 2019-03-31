package excercise;
import java.util.Scanner;

public class PositiveNagativeFrom20 {
	
	    public static void main(String args[])
	    {
	        int countp=0, countn=0, countz=0, i;
	        int arr[] = new int[10];
	        
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Enter 10 Numbers : ");
	        for(i=0; i<10; i++)
	        {
	            arr[i] = scan.nextInt();
	        }
	        for(i=0; i<10; i++)
	        {
	            if(arr[i] < 0)
	            {
	                countn++;
	            }
	            else if(arr[i] == 0)
	            {
	                countz++;
	            }
	            else
	            {
	                countp++;
	            }
	        }
			
	        System.out.print(countp + " Positive Numbers");
	        System.out.print("\n" + countn + " Negative Numbers");
	        System.out.print("\n" + countz + " Zero");
	    }
	}

