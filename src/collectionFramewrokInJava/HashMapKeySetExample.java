package collectionFramewrokInJava;

import java.util.HashMap;
import java.util.Set;

public class HashMapKeySetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize the hashmap object with Integer as key and String as value
				HashMap<Integer, String> mapStudent = new HashMap<Integer, String>();
				
				// populate the student map
				mapStudent.put(13215, "Steve Atkins");
				mapStudent.put(17891, "Albert Travis");
				mapStudent.put(98412, "Paolo Quintos");
				
				//get the keys
				Set<Integer> setOfKeys = mapStudent.keySet();
				System.out.println("Initial value of keys:"+setOfKeys);
				
				// add another key value mapping
				mapStudent.put(6547541, "Sheila Davis");
				
				// print the values which the set contains
				System.out.println("New set of keys:"+setOfKeys);	
	}

}
