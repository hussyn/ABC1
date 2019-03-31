package a.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CountDublicateElementinArrayList {
	
	public static void main(String[] args) {
		
	
	List<String> list=new ArrayList<String>();
	list.add("sajjad");
	list.add("ajay");
	list.add("sajjad");
	list.add("ajay");
	list.add("vijay");
	list.add("ajay");
	
	HashSet<String> hs=new HashSet<String>(list);
	System.out.println("Duplicates\tElement Name");
	System.out.println("==========\t=================");
	for (String str : hs) {
		System.out.println(Collections.frequency(list, str)+"\t\t"+str);
	}
	//System.out.println();

	//Iterator<String> x = list.iterator();


}}
