package a.collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortingHashtableInAscendingOrder {
	
		 
	    public static void main(String[] args) {
	 
	        // creating Hashtable object of type <String, String>
	        Hashtable<String, String> hashtable = 
	                new Hashtable<String, String>(); 
	 
	        // adding key-value pairs to Hashtable object
	        hashtable.put("Microsoft", "Bill Gates");
	        hashtable.put("Apple", "Steve Jobs");
	        hashtable.put("Google", "Sundar Pichai");
	        hashtable.put("LinkedIn", "Reid Hoffman");
	        hashtable.put("Facebook", "Mark Zuckerberg");
	 
	        // Random Order iterating
	        System.out.println("Before Sorting : Random Order \n");
	 
	        // getting keySet() into Set
	        Set<String> set = hashtable.keySet();
	 
	        // get Iterator from key set
	        Iterator<String> itr = set.iterator();
	 
	        // iterating in random order
	        while(itr.hasNext()) {
	            String key = itr.next();
	            System.out.println("Key : "  + key + "\t\t"
	                    + "Value : "  + hashtable.get(key));
	        }
	 
	 
	        // After Sorting : Ascending order
	        System.out.println("\n\n\nAfter Sorting : Ascending order\n");
	 
	        // convert to TreeMap
	        Map<String, String> ts = new TreeMap<String, String>(hashtable);
	 
	        // iterate acc to ascending order of keys
	        for(String strKey : ts.keySet()){
	            System.out.println("Key : "  + strKey + "\t\t"
	                    + "Value : "  + hashtable.get(strKey));
	        }
	    }
	
}
