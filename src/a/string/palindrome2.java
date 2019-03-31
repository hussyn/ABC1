package a.string;

public class palindrome2 {

	public static void isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;


	while (palindrome > 0) {
        int remainder = palindrome % 10;
        palindrome = palindrome / 10;
        reverse = reverse * 10 + remainder;
        
        
    }
	System.out.println(reverse);
	// if original and reverse of number is equal means
    // number is palindrome in Java
    if (number == reverse) {
    	System.out.println("palindrome");
       // return true;
        
    }else
    System.out.println("palindrome Not");
    //return false;


	}
	
	public static void main(String[] args) {
		
		int number =1214;
		isPalindrome(number);
		



	}
}
