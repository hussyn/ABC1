package a.shak;
public class StringExample2 {

	public static void main(String[] args) {
		/*String s = new String("Hello String");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Hello StringBuffer");
		System.out.println(sb);
		
		StringBuilder sbd = new StringBuilder("Hello StringBuilder");
		System.out.println(sbd);*/
		
		
		//*** String is an immutable(not changeable) class.
		// Every operation on the String object will always create new object
		
		String name = new String("Hello");
		name = name.concat("World");
		name = name.toUpperCase();
		System.out.println(name); 
		
		// ** StringBuffer/StringBuilder are mutable
		// ** StringBuffer is thread safe , StringBuilder not.
		// ** StringBuffer operations are slower than that of StringBuilder.
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("World");
		sb.append("Program");
		sb = sb.reverse();  // no change even if reference is re assigned like String above
		
		System.out.println(sb);
		
		StringBuilder sbd = new StringBuilder("Good"); sbd.append(" Morning");
		System.out.println(sbd); 
		
		// Like String, there are other classes in java as well which are immutable
		// java.lang.Integer, java.lang.Long, java.lang.Boolean, java.lang.Double, java.lang.Float ...
		
		// int, long, boolean, double, float : primitive data type.
		
		// Can you write your own immutable class. If yes, How ?
		// class Emp {}  // Homework???

//An object is immutable if its state cannot change after construction. 
//Immutable objects don’t expose any way for other objects to modify their state; 
//the object’s fields are initialized only once inside the constructor and never change again.
		
	}

}






