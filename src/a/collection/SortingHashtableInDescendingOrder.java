package a.collection;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortingHashtableInDescendingOrder {
	public static void main(String[] args) {
		 
        // creating Hashtable object of type <String, String>
        Hashtable<String, String> hashtable = 
                new Hashtable<String, String>(); 
 
        // adding key-value pairs to Hashtable object
        hashtable.put("Google", "Sundar Pichai");
        hashtable.put("Facebook", "Mark Zuckerberg");
        hashtable.put("LinkedIn", "Reid Hoffman");
        hashtable.put("Apple", "Steve Jobs");
        hashtable.put("Microsoft", "Bill Gates");
 
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
        System.out.println("\n\n\nAfter Sorting : Descending order\n");
 
        // convert to TreeMap
        Map<String, String> ts = 
                new TreeMap<String, String>(Collections.reverseOrder());
 
        // put all key-value into TreeMap
        ts.putAll(hashtable);
 
        // iterate acc to descending order of keys
        for(String strKey : ts.keySet()){
            System.out.println("Key : "  + strKey + "\t\t"
                    + "Value : "  + hashtable.get(strKey));
        }
    }
}
