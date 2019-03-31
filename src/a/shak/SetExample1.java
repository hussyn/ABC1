package a.shak;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// HashSet - no duplicates
// It is not index based - can net value by index
// insertion order not guaranteed.
public class SetExample1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Pune");
		set.add("Delhi");
		set.add("Kolkata");
		set.add("Chennai");
		
		System.out.println(set.add("Mumbai"));
		System.out.println(set.add("Delhi")); // duplicate, not added
		String city = "Pune";
		System.out.println("Is Pune city exists : "+set.contains(city)); 
		
		//set.remove(city);
		//System.out.println("Is Pune city exists : "+set.contains(city)); 
		System.out.println("------------Traversing using for-each loop-------------------");
		
		// for each loop- java 1.5 
		for(String t : set) {
			System.out.println(t); 
		}
		
		System.out.println("-----------Traversing using iterator--------");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
