package collectionFramewrokInJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StoreDuplicateKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, List<String>> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		map.put("key1", list);
		map.get("key1").add("value1");
		map.get("key1").add("value2");
		

		//(map.get("key1").get(0)).isEqualTo("value1");
		//(map.get("key1").get(1)).isEqualTo("value2");
		
		Map<String, String> map1 = Stream.of(new String[][] {
			  { "Hello", "World" }, 
			  { "John", "Doe" }, 
			}).collect(Collectors.toMap(data -> data[0], data -> data[1])); 
		//Notice here the data type of key and value of the Map is same.
		//In order to make it more generic let’s take the array of Objects and perform the same operation:
		Map<String, Integer> map2 = Stream.of(new Object[][] { 
		    { "data1", 1 }, 
		    { "data2", 2 }, 
		}).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));
		//Here, we create a map of the key as String and value as an Integer.
	}

}
