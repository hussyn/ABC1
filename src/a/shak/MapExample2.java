package a.shak;
import java.util.LinkedHashMap;
import java.util.Map;

// Map - you can store key-value pair
// keys are unique- can't have duplicate key
// If you put same key again, old value will be replaced with new one.
public class MapExample2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		
		map.put("Nursery", 100);
		map.put("Lkg", 25);
		map.put("Ukg", 23);
		map.put("One", 50);
		map.put(null, null);
		
		 
		System.out.println("-----------------");
		for(String key : map.keySet()) {
			System.out.println(key +"->"+ map.get(key)); 
		}
		
	}

}
