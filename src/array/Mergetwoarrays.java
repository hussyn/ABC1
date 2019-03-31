package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mergetwoarrays {
	public static void main(String args[]){
	    String a[] = {"a", "b", "c"};
	    String b[] = {"d", "e" };

	    List<String> list = new ArrayList<String>(Arrays.asList(a));
	    list.addAll(Arrays.asList(b));
	    Object [] c = list.toArray();
	    System.out.println(Arrays.toString(c));
	    /*
	     output :  [a, b, c, d, e]
	    */
	  }
	
}
