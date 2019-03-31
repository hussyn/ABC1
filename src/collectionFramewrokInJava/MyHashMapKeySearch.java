package collectionFramewrokInJava;

import java.util.HashMap;

public class MyHashMapKeySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        if(hm.containsKey("first")) {
        	System.out.println(hm.get("first"));
        }
        
        if(hm.containsValue("SECOND INSERTED")) {
        	System.out.println("getOrDefault:"+hm.getOrDefault("second", "defaultValue"));
        }
	}

}
