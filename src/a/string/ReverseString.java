package a.string;

public class ReverseString {
	
	public static void main(String[] args) {
		
	
	String Inputstr="sajjad";
	ReverseString(Inputstr);
	}
	
	public static void ReverseString(String Inputstr) {
	for(int i=Inputstr.length()-1;i>=0;i--) {
		String revword="";
		revword=revword+Inputstr.charAt(i);//Returns the char value at the specified index. 
		System.out.println(revword);
		
	} 
	

}}
