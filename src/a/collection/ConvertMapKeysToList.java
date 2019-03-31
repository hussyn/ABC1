package a.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
 //Conversion of Map to List in Java
/*Method1-Converting Map keys into List of keys using keySet(); of Map
Method2-Converting Map values into List of values using values(); of Collection
Method3-Converting Map entries into List of entries using entrySet(); of Map*/
public class ConvertMapKeysToList {
 
    // main() method - entry point for JVM
    public static void main(String[] args) {
 
        // creating HashMap object of type <Integer, String>
        Map<Integer, String> rankCompany = new HashMap<Integer, String>();
                
 
        // adding key-value pairs to HashMap object
        rankCompany.put(1, "IBM");
        rankCompany.put(2, "Microsoft");
        rankCompany.put(3, "Accenture");
        rankCompany.put(4, "Oracle");
        rankCompany.put(5, "Hewlett Packard");
        rankCompany.put(6, "SAP");
        rankCompany.put(7, "TCS");
 
        // get keys using keySet() method of Map interface
        Set<Integer> setOfKeys = rankCompany.keySet();
 
        // Convert Map keys to List 
        // using inter-conversion collection constructor
        List<Integer> rankList = new ArrayList<Integer>(setOfKeys);
 
        System.out.println("Converting Map KEYS into List\n");
 
        // iterating using enhanced for-loop
        for (Integer rank : rankList) {
            System.out.println(rank);
        }
 
        // print no. of keys present inside List
        System.out.println("\n\nTotal no. of keys in List is : "
                + rankList.size());
    }
}
