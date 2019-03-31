package programs;

import java.util.Scanner;

public class reversenumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner s=new Scanner(System.in);
		//int input=s.nextInt();
		int input = 123;
		int result=reverseno(input);
		

		System.out.println("The reversed number is " + result);
	}
	
	public static int reverseno(int n) {
		
		int result=0;
		int rem;
		while (n>0) {
			rem=n%10;
			n=n/10;
			result=result*10+rem;
					
			
		}
		return result;
		
	}

}
