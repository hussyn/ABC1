package collectionFramewrokInJava;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableExample {

	private static final int ht = 0;

	public static void main(String[] args) {
	
		String key;
		// Creating a ht
		Hashtable<String,String> ht=new  Hashtable<String,String>();
		// Adding Key and Value pairs to ht
		   ht.put("key1", "sajjad1");
		   ht.put("Key2","Ajeet");
		   ht.put("Key3","Peter");
		   ht.put("Key4","Ricky");
		   ht.put("Key5","Mona");
		   
		   System.out.println(ht);
		   ht.replace("Key5", "Mona", "Monaza");
		   ht.replace("Key4", "Ricky1");
		
		   System.out.println(ht);
		    Enumeration<String> x = ht.keys();
		 
		   while (x.hasMoreElements()) {
			   String key1 = (String) x.nextElement();
			   System.out.println(""+key1 + ":" +ht.get(key1));
			
		}
		 
	}

}
