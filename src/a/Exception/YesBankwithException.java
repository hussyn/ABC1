package a.Exception;

public class YesBankwithException {
	public static void main(String args[])
	  {
	    int balance = 100, withdraw = 1000;
	    if (balance < withdraw)
	    {
	      ArithmeticException e = new ArithmeticException("No money please");                    
	      throw e; 
	    }
	    else
	    {
	      System.out.println("Draw & enjoy Sir, Best wishes of the day");
	    }
}
}