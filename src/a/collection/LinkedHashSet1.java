package a.collection;

import java.util.LinkedHashSet;

//Program: How to search an object from LinkedHashSet?
public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        //add elements to HashSet
        lhs.add("first");
        lhs.add("second");
        lhs.add("third");
        System.out.println(lhs);
        System.out.println("Does set contains 'first'? "+lhs.contains("first1"));
    }

	

}
