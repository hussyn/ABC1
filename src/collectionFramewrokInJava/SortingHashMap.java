package collectionFramewrokInJava;

import java.util.HashMap;
import java.util.TreeMap;

public class SortingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String > map = new HashMap<>();
		map.put(21, "Twenty One"); 
		map.put(31, "Thirty One");
		map.put(41, "Thirty One"); 
		System.out.println("Unsorted HashMap: " + map); 
		TreeMap sortedHashMap = new TreeMap(map); 
		System.out.println("Sorted HashMap: " + sortedHashMap); 

		
	}

}
