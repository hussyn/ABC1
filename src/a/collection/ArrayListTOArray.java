package a.collection;

import java.util.ArrayList;

public class ArrayListTOArray {
	public static void main(String[] args) {

		/*ArrayList declaration and initialization*/
		ArrayList<String> arrlist= new ArrayList<String>();
		arrlist.add("String1");
		arrlist.add("String2");
		arrlist.add("String3");
		arrlist.add("String4");
		
		/*ArrayList to Array Conversion */
		String array[] = new String[arrlist.size()];     
		arrlist.toArray();
		
		
	}}