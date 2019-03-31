package collectionFramewrokInJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		    HashSet<String> set=new HashSet();  
		           set.add("One");    
		           set.add("Two");    
		           set.add("Three");   
		           set.add("Four");  
		           set.add("Five");  
		           Iterator<String> x = set.iterator();
		           while(x.hasNext()) {
		        	   System.out.println(x.next());
		           }
/*		           boolean hasNext()
		           Returns true if the iteration has more elements. (In other words, returns true if next() would return an element rather than throwing an exception.)
		           Returns: 
		           true if the iteration has more elements */
		           
/*		           Returns the next element in the iteration.
		           Returns: 
		           the next element in the iteration 
		           Throws: 
		           NoSuchElementException - if the iteration has no more elements    */	   
		           
}
}