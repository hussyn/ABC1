package collectionFramewrokInJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class MapToList {

	public static void main(String[] args) {
		/** * Java Program to Convert HashMap into ArrayList in Java */

		 HashMap<String, Integer> schoolAgeCriteria = new HashMap<String, Integer>(); 
		// preparing HashMap with keys and values 
		 schoolAgeCriteria.put("NursuryClass age criteria", 3); 
		 schoolAgeCriteria.put("KinderGarden1 age criteria ", 4); 
		 schoolAgeCriteria.put("KinderGarden2 age criteria ", 5); 
		 schoolAgeCriteria.put("PrimarySchool age criteria", 6); 
		 System.out.println("Size of schoolAgeCriteria Map: " + schoolAgeCriteria.size()); 
		 // 1st Example : Converting HashMap keys into ArrayList 
		 Set<String> keySet = schoolAgeCriteria.keySet(); 
		 List<String> schoolKeyList = new ArrayList<String>(keySet); 
		 System.out.println("Size of Key list from Map: " + schoolKeyList.size()); 
		 // print list element System.out.println("Printing HashMap keys from converted list : "); 
		 for (String key : schoolKeyList) 
		 { System.out.println("Printing HashMap keys from converted list :"+key); 
		 } 
		 
		 
		 // 2nd Example : Converting HashMap Values into ArrayList 
		 Collection<Integer> values = schoolAgeCriteria.values(); 
		 List<Integer> schoolValueList = new ArrayList<Integer>(values); 
		 System.out.println("Size of Value list from Map: " + schoolValueList.size()); 
		 // print values from list 
		 System.out.println("Printing HashMap values from converted list :"); 
		 for (Integer value : schoolValueList) { 
			 System.out.println(value); } 
		 
		 
		 // 3rd Example : Converting HashMap into ArrayList using Entry Set 
		 Set<Entry<String, Integer>> set = schoolAgeCriteria.entrySet(); 
		 
		 List<Entry<String, Integer>> schoolAgeCriteriaList = new ArrayList<>(set); 
		 Iterator<Entry<String, Integer>> it = schoolAgeCriteriaList.iterator(); 
		 while (it.hasNext()) 
		 { Entry<String, Integer> entry = it.next(); 
		 System.out.println("Entry from converted list : " + entry); 
		 } 
		
		}

}
