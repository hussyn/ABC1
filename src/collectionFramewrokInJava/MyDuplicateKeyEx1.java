package collectionFramewrokInJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MyDuplicateKeyEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Price, String> hm = new HashMap<Price, String>();
		hm.put(new Price("Banana", 20), "Banana");
		Price Price=new Price("apple", 30);
		hm.put(Price, "apple");
		System.out.println(hm);
		printMap(hm);
		
	}	
		public static void printMap(HashMap<Price, String> map){
	         
	        Set<Price> keys = map.keySet();
	        for(Price p:keys){
	            System.out.println(p+"==>"+map.get(p));
	        }
		
/*		Map<K,V> m=new LinkedHashMap<K,V>();
		for(Map.Entry<K,V> entry: m.entrySet())
		    System.out.println(entry.getKey() + ": " + entry.getValue());
		In Java 8 you can write

		m.forEach((k, v) -> System.out.println(k + ": " + v));*/
	}

}
