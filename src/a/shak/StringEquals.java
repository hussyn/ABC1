package a.shak;

public class StringEquals {
public static void main(String[] args) {
	String str1 = new String("sajjad");
	String str2 = str1;
	if(str1 == str2)
	{
		System.out.println("Both Objects are equal");
	}
	else
	{
		System.out.println("Both Objects are not equal");
	}
	
	
}

}
//output-Both Objects are equal-as both object refers to the same place in the memory.