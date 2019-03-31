package a.shak;
import java.util.Map;
import java.util.TreeMap;

// TreeMap - you can store key-value pair
// keys are unique- can't have duplicate key
// If you put same key again, old value will be replaced with new one.
// Keys are sorted -
public class MapExample3 {

	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>();
		
		map.put("Nursery", 100);
		map.put("Lkg", 25);
		map.put("Ukg", 23);
		map.put("One", 50);
		 
		System.out.println("-----------------");
		for(String key : map.keySet()) {
			System.out.println(key +"->"+ map.get(key)); 
		}
		
	}

}
