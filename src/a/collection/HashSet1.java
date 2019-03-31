package a.collection;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
//set -In a set, no duplicates are allowed.Set is an unordered collection, it doesn’t maintain any order.  
//HashSet-
//add
public class HashSet1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<String> set=new HashSet<String>();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        set.add("Five");  
        //System.out.println(set);
        for (String set2 : set) {
			System.out.println(set2);
		}
 
        Iterator<String> x = set.iterator();
        while(x.hasNext()) {
        	System.out.println(x.next());
        	
        }
        
        //Removing all the elements available in the set 
        set.clear();  
        System.out.println(set);
	}
}
