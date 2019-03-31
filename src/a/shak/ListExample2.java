package a.shak;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// LinkedList uses linked nodes internally as ds.
// 
public class ListExample2 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
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




