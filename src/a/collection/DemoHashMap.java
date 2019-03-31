package a.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Creating HashMap object
        Map<Integer, String> hashMap = 
                new HashMap<Integer, String>();
 
        // 1.1 add few entries
        hashMap.put(40, "RajKumarHirani");
        hashMap.put(50, "SanjayLeelaBanshali");
        hashMap.put(20, "Shankar");
        hashMap.put(10, "ManiRatnam");
        hashMap.put(30, "RajaMouli");
        hashMap.put(null, null);
 
        // 1.2 get entrySet()
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();   
 
        System.out.println("Displaying HashMap entries"
                + " in Random-order : \n");
 
        // 1.3 Iterate using enhanced for-Each loop
        for(Map.Entry<Integer, String> entry : entries) {
            System.out.println("Rank : " + entry.getKey() 
                    + "\t Director : " + entry.getValue());
        }
	}

}
