package a.shak;
public class StringExample3 {

	public static void main(String[] args) {
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		//System.out.println(s1 == s2);  // false
		//System.out.println(s1.equals(s2)); // true
		
		// Pass by value , no pass by address/ref
		//int x = 10, y = 10;
		//System.out.println(x == y);  //true
		
		String s11 = "abcd"; // constants
		String s22 = "abcd";
		System.out.println(s11 == s22); // true
		System.out.println(s11.equals(s22));  // true
	}

}
