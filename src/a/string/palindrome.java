package a.string;

public class palindrome {

	public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;


	while (palindrome != 0) {
        int remainder = palindrome % 10;
        palindrome = palindrome / 10;
        reverse = reverse * 10 + remainder;
       
        
    }
	// if original and reverse of number is equal means
    // number is palindrome in Java
    if (number == reverse) {
    	System.out.println("palindrome");
        return true;
        
    }
    System.out.println("palindrome Not");
    return false;


	}
	
	public static void main(String[] args) {
		
		int number =121;
		isPalindrome(number);
		
		if(isPalindrome(number)){
            System.out.println("Number : " + number + " is a palindrome");
        }else{
            System.out.println("Number : " + number + " is not a palindrome");
        }       



	}
}
