package a.collection;
import java.util.Hashtable;
import java.util.Map;

public class Hashtable1 {

	  public static void main (String[] args) {
	    //How to Create Hashtable?
	    Hashtable < Integer,String > days = new Hashtable < Integer,String > ();
	    //How to Add Key/Value pairs in Hashtable?
	    days.put(1,"Sunday");
	    days.put(2,"Monday");
	    days.put(3,"Tuesday");
	    days.put(4,"Wednesday");
	    days.put(5,"Thursday");
	    days.put(6,"Friday");
	    days.put(7,"Saturday");
	    //How to iterate through Hashtable?
	    for(Map.Entry m:days.entrySet()){
	        System.out.println(m.getKey()+" "+m.getValue());
	    }
	  }
}
