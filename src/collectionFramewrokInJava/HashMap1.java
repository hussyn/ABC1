package collectionFramewrokInJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();    
	    System.out.println("Initial list of elements: "+hm);  
	      hm.put(100,"Amit");    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Rahul"); 
	      hm.put(103,"Rahul"); 
	      hm.put(103,"Rahul1"); 
	      hm.put(103,"Rahul1"); 
	      System.out.println(hm);
	      for (Entry string : hm.entrySet()) {
	    	  System.out.println(string.getKey()+" "+string.getValue()); 
		}
	      
	      for (Entry<Integer, String> string : hm.entrySet()) {
	    	  System.out.println("Entry<>"+string.getKey()+" "+string.getValue()); 
		}

	      for(Map.Entry m:hm.entrySet()){    
	          System.out.println(m.getKey()+" "+m.getValue());    
	         }  
	      
	      
	      
	      
	      
	     
	      
	      Map<String,String> countryNames = new HashMap<String,String>(200);
	      
	      countryNames.put("GB", "Great Britain");
	      countryNames.put("FR", "France");
	      countryNames.put("IT", "Italy");
	      countryNames.put("FW", "Far Far Away");
	      //Then, to retrieve the country name for a particular code, we call:

	      String name = countryNames.get("IT");
	      System.out.println("countryNames IT: "+name); 
	      System.out.println("countryNames: "+countryNames); 
			HashMap<String,String> hm1=new HashMap<String,String>();    
		    System.out.println("Initial list of elements: "+hm);  
		      hm.put(100,"Amit1");   //1)Exception in thread "main" java.lang.Error: Unresolved compilation problem: 2)The method put(Integer, String) in the type HashMap<Integer,String> is not applicable for the arguments (String, String) 
		      hm.put(101,"Vijay1");    
		      hm.put(102,"Rahul1"); 
		      hm.put(103,"Rahul1"); 
		      hm.put(103,"Rahul2"); 
		      hm.put(103,"Rahul3"); 
		      System.out.println(hm);
	      
	      
	      
	      Map m1 = new HashMap(); 
	      m1.put("Zara", "8");
	      m1.put("Zara", "zaman");
	      m1.put("Mahnaz", "31");
	      m1.put("Ayan", "12");
	      m1.put("Daisy", "14");

	      System.out.println();
	      System.out.println(" Map Elements");
	      System.out.print("\t" + m1);
	}

}
