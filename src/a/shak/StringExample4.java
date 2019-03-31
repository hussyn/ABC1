package a.shak;
public class StringExample4 {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1 == s2);  // false
		System.out.println(s1.equals(s2)); // true
		
		System.out.println("-------------------------");
		
		StringBuffer sb1 = new StringBuffer("Hello"); 
		StringBuffer sb2 = new StringBuffer("Hello");
		
		System.out.println(sb1 == sb2); // false
		System.out.println(sb1.equals(sb2));  //  false : why ?
	}

}
// java.lang.Object has equals method
// String class has overridden and has provided its own implmentation
// StirngBuffer has not overridden, it is using the parent version, where == is used to check equality