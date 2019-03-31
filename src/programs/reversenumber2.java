package programs;

import java.util.Scanner;

public class reversenumber2 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		s.nextInt();
		int num=123;
		int reverseno=reverse(num);
		System.out.println("hello:"+reverseno);
	}
	

		public static int reverse(int num) {
			 int Result=0;
			 System.out.println("hello inside method");
			 int  rem;
			while(num>0) {
				rem=num%10;//3, 2
				System.out.println("final rem:"+rem);
				num=num/10;//12, 1
				System.out.println("final num:"+num);
				Result=Result*10+rem;//3,32
				System.out.println("final result:"+Result);
				
			
			}
			return Result;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	/*public static int reverseno(int n) {
		
		int result=0;
		int rem;
		while (n>0) {
			rem=n%10;
			n=n/10;
			result=result*10+rem;
					
			
		}
		return result;
		
	}*/

}
