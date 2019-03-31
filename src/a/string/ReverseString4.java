package a.string;

import java.util.Scanner;

public class ReverseString4
{
	
	
	static String reverse(String original) {
	    String reversed = "";
	    for (int i = original.length() - 1;  0 <= i; i--) {
	        reversed += original.charAt(i);
	    }
	    System.out.println(reversed);
	    return reversed;
	    
	}
	
    public static void main(String[] args)
    {
    	
    	reverse("sajjad");
    	

    }
}