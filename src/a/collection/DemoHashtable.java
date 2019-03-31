package a.collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class DemoHashtable {
	public static void main(String[] args) {
		 
        // 1. Creating Hashtable object
        Map<Integer, String> hashtable = 
                new Hashtable<Integer, String>();
 
        // 1.1 add few entries
        hashtable.put(40, "RajKumarHirani");
        hashtable.put(20, "Shankar");
        hashtable.put(10, "ManiRatnam");
        hashtable.put(50, "SanjayLeelaBanshali");
        hashtable.put(30, "RajaMouli");
 
        // 1.2 get entrySet()
        Set<Map.Entry<Integer, String>> entries = hashtable.entrySet(); 
 
        System.out.println("Displaying Hashtable entries"
                + " in Random-order : \n");
 
        // 1.3 Iterate using enhanced for-Each loop
        for(Map.Entry<Integer, String> entry : entries) {
            System.out.println("Rank : " + entry.getKey() 
                    + "\t Director : " + entry.getValue());
        }
}}
