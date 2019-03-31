package a.collection;
//Write a program to find duplicate value from an array.
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
//create TreeSet object and add array entries to the TreeSet. Since the set doesnot support duplicate entries, you can easily findout duplicate entries
public class MyDuplicateEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"one","two","three","four","four","five"};
		
        TreeSet<String> unique = new TreeSet<String>();
        for(String str:strArr){
            if(!unique.add(str)){
                System.out.println("Duplicate Entry is: "+str);
            }
        }}

}
