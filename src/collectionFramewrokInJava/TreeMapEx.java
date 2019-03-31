package collectionFramewrokInJava;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> tm=new TreeMap<String,String>();
		tm.put("key1", "sajjad");
		tm.put("key2", "sajjad");
		tm.put("key3", "sajjad");
		System.out.println(tm);
		Set<Entry<String, String>> x = tm.entrySet();
		
		for (Entry<String, String> entry : x) {
			System.out.println(entry.getKey());
		}
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");    
	        
	
	
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    

	}
	}
}
