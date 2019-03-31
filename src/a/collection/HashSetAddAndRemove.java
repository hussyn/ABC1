package a.collection;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetAddAndRemove {
//http://www.benchresources.net/hashset-class-in-java/

	 
	    public static void main(String[] args) {
	 
	        // creating HashSet object of type String
	        HashSet<String> hs = new HashSet<String>();
	 
	        // adding elements to HashSet object
	        hs.add("Sundar Pichai");
	        hs.add("Satya Nadella");  
	        hs.add("Shiv Nadar");  
	        hs.add("Shantanu Narayen");
	        hs.add("Sundar Pichai"); // adding duplicate element
	        hs.add("Francisco D’Souza");
	 
	        // adding null element to HashSet
	        hs.add(null);
	        hs.add(null); // 2nd null is added to hs
	 
	 
	        // creating Iterator reference
	        Iterator<String> ceo = hs.iterator();
	 
	        System.out.println("Iterating using Iterator\n");
	 
	        // iterating using while loop
	        while (ceo.hasNext()){
	            System.out.println(ceo.next()); 
	        }
	 
	        System.out.println("\n\nprinting inside"
	                + " square brackets []");
	        System.out.println(hs);
	    }
	
}
