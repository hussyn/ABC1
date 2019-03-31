package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mergetwoarrays2 { //CollectionUtils
	private Mergetwoarrays2 () {}

	  public static String[] join(String [] ... parms) {
	    // calculate size of target array
	    int size = 0;
	    for (String[] array : parms) {
	      size += array.length;
	    }

	    String[] result = new String[size];

	    int j = 0;
	    for (String[] array : parms) {
	      for (String s : array) {
	        result[j++] = s;
	      }
	    }
	    return result;
	  }

	  public static void main(String[] args) {
	    String a[] = { "1", "2", "3" };
	    String b[] = { "4", "5", "6" };
	    String c[] = { "7", "8", "9" };

	    String[] big = (String [])join(a,b,c);
	    System.out.println(java.util.Arrays.toString(big));
	    /*
	     * output :
	     *    [1, 2, 3, 4, 5, 6, 7, 8, 9]
	     */
	  }
}
