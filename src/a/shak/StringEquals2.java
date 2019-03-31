package a.shak;

public class StringEquals2 {
public static void main(String[] args) {
	
	//String class overrides the equals method to compare if the character in the String is equal. 
	String str1 = new String("javainterviewpoint");
	String str2 = new String("javainterviewpoint");
	if(str1.equals(str2))//equals method checks for the content of both the str objects
	{
		System.out.println("Both Objects are equal");//Both Objects are equal
	}
	else
	{
		System.out.println("Both Objects are not equal");
	}
	
	////because ‘==’ checks for the memory here str1 and str2 are present in a different memory addresses,
	String str3 = new String("javainterviewpoint");
	String str4 = new String("javainterviewpoint");
	if(str3 == str4)
	{
		System.out.println("Both Objects are equal");//Both Objects are not equal
	}
	else
	{
		System.out.println("Both Objects are not equal");
	}
}}