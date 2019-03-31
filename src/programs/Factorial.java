package programs;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int result=1;
		int i=1;
		//factorial=fact*i
				
				for( i=1;i<=n;i++) 
				{
					System.out.println("loop"+result);
					result=result*i;
					
		System.out.println(""+result);
		}
}
}