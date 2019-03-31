package a.shak;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

// Vector is a legacy class (existance before jdk 1.4)
// Vector is thread safe
public class ListExample3 {

	public static void main(String[] args) {
		List<String> list = new Vector<>();
		list.add("PATNA");
		list.add("HYDERABAD");
		list.add("KOLKATA");
		list.add("DELHI");
		
		//list.remove(1); //remove value at index 1
		
		//System.out.println(list.get(1)); 
		
		/*for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i)); 
		}*/
		
		// for-each loop
		for(String t : list) {
			System.out.println(t); 
		}
		
		Collections.sort(list);
		System.out.println("***** After sort******");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); 
		}
		
		
	}

}




