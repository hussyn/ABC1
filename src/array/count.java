package array;

import java.util.Arrays;
import java.util.Scanner;
//not effective
public class count {
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int[] numbers=new int[5];
	    String x=null;
	    System.out.print("enter the number 10:"+"/n");
	    for(int i=0;i<5;i++){
	        numbers[i] = input.nextInt();
	    }
	    System.out.print("Numbers  :  count"+"\n");
	    int count=1;
	    Arrays.sort(numbers);
	    for(int z=0;z<5;z++){
	        for(int j=0;j<z;j++){
	            if(numbers[z]==numbers[j] & j!=z){
	                count=count+1;
	            }
	        }
	        System.out.print(numbers[z]+" - "+count+"\n");
	        count=1;
	    }
	    }
}
