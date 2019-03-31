package a.string;
//Program to swap two string variables without using third or temp variable
public class Swaptwostringvariables {
	
	public static void main(String[] args) {
		
	
	String str1="Hello";
	String str2="Sajjad";
	//output=swap two
	
	 str1=str1+str2;
	System.out.println(str1.length());
	//str="HelloSajjad";
	str2=str1.substring(0,str1.length()-str2.length());
	str1=str1.substring(str2.length());
	System.out.println("str1:"+str1);
	System.out.println("str2:"+str2);
	
			
}
}