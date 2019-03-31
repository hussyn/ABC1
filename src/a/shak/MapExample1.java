package a.shak;
import java.util.HashMap;
import java.util.Map;

// HashMap - you can store key-value pair
// keys are unique- can't have duplicate key
// If you put same key again, old value will be replaced with new one.
public class MapExample1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Nursery", 100);
		map.put("Lkg", 25);
		map.put("Ukg", 23);
		map.put("One", 50);
		
		System.out.println(map.get("Lkg")); 
		int oldValue = map.put("Lkg", 100); //same key, value will be updated.
		System.out.println(oldValue +" is replaced by "+ 100);
		
		System.out.println(map.get("Lkg")); 
		
		map.remove("One");  
		System.out.println("-----------------");
		for(String key : map.keySet()) {
			System.out.println(key +"->"+ map.get(key)); 
		}
		
	}

}
