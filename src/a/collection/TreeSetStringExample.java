package a.collection;

import java.util.TreeSet;

public class TreeSetStringExample  {
	 
    public static void main(String[] args) {
        // creating TreeSet object of type String
        TreeSet<String> ts = new TreeSet<String>();
 
        // adding elements to TreeSet object
        ts.add("Sundar Pichai");
        ts.add("Satya Nadella");  
        ts.add("Shiv Nadar");  
        ts.add("Shantanu Narayen");
        ts.add("Sundar Pichai"); // adding duplicate element
        ts.add("Francisco D’Souza");
        ts.add("Vishal Sikka");
        ts.add("Chanda Kochhar");
        
        // adding null element to TreeSet
        ts.add(null);
        //ts.add(null); // 2nd null is added to ts
 
        // according to natural ordering
        System.out.println("Sorted according"
                + " to Natural-ordering:\n");
        for(String CEO : ts){
            System.out.println(CEO);    
        }
    }
}