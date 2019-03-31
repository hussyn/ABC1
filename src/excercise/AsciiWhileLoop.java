package excercise;

public class AsciiWhileLoop {

	    public static void main(String args[])
	    {
	        for(int i=1; i<=255; i++)
	        {
	        	String ch = new Character((char) i).toString();
	            System.out.println(i+ " -> " + ch + "\t");
	        }
			
	    }
	}

