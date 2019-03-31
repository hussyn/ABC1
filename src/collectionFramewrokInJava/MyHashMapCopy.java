package collectionFramewrokInJava;

import java.util.HashMap;

public class MyHashMapCopy {
//How to copy Map content to another HashMap
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        HashMap<String, String> MapCopy = new HashMap<String, String>();
        MapCopy.put("key", "value");
        MapCopy.putAll(hm);
        System.out.println("MapCopy:"+MapCopy);
        
	}

}
