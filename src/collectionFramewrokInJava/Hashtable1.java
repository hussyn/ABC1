package collectionFramewrokInJava;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashtable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");  
		  
		  System.out.println(hm.getOrDefault(105, "notfound"));
		  System.out.println(hm.entrySet());//method returns a set having same elements as the hash map
		  for (Entry<Integer, String> kv : hm.entrySet()) {
			  System.out.println(kv);
			
		}
		  hm.remove(100);
	}

}
