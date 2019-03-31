package a.WrapperClassInnerClass;

public class WrapperClasses {
	public static void main(String args[]){  
		//Converting int into Integer  
		
		//convert int to String
		int i=10;
		String s="10A";
		System.out.println(String.valueOf(i)+s);
		System.out.println(i+s);
		System.out.println(Integer.parseInt(s));//java.lang.NumberFormatException: For input string: "10A"
}
}