package collectionFramewrokInJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEntrySetExample {

		// TODO Auto-generated method stub
		/*
		 * This example source code demonstrates the use of  
		 * entrySet() method of HashMap class
		 */

			public static void main(String[] args){

				// initialize the HashMap object with Integer as key and String as value
				HashMap<Integer, String> mapEmployee = new HashMap<Integer, String>();
				
				// populate the student map
				mapEmployee.put(1287, "Aquilino Pimentel");
				mapEmployee.put(3125, "Travis Davis");
				mapEmployee.put(9972, "Marianne Laste");
				Set<Entry<Integer, String>> x = mapEmployee.entrySet();

				System.out.println("Initial value of keys x:"+x);
				//get the keys
				Set<Map.Entry<Integer, String>> mappingSet = mapEmployee.entrySet();
				System.out.println("Initial value of keys:"+mappingSet);
				
				// add another key value mapping
				mapEmployee.put(4581, "Kate Visor");
				
				// print the values which the set contains
				System.out.println("New set of keys:"+mappingSet);
				System.out.println("Initial value of keys x:"+mapEmployee);
				//did you notice that we have not invoked the entrySet after we have put additional key on our HashMap and yet the new key were added to the mappingSet. This is the inherent behavior of entrySet() method when you modify the HashMap object the Set would also be modified. 
			}	
	}


