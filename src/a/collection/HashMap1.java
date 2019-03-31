package a.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	  public static void main (String[] args) {
	    //Create HashMap
	    HashMap < Integer,String >  days = new HashMap < Integer,String > ();
	    //Add Key/Value pairs
	    days.put(1,"Sunday");
	    days.put(2,"Monday");
	    days.put(3,"Tuesday");
	    days.put(4,"Wednesday");
	    Set <  Map.Entry <  Integer,String > > set = days.entrySet();
	    for (Map.Entry <  Integer,String > sg : set) {
	      System.out.println("Key :"+sg.getKey() + "   Value :"+days.get(sg.getKey()));
	    }
	  }
}
