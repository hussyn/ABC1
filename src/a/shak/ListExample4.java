package a.shak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample4 {

	public static void main(String[] args) {
		List<Student> sList = new ArrayList<>();
		sList.add(new Student(101,"Pasha",8.6));
		sList.add(new Student(103,"Sajjad",8.1));
		sList.add(new Student(104,"Shakir",8.7));
		sList.add(new Student(102,"Ajay",8.4));
		
		System.out.println("********Before Sorting*********");
		for(Student s : sList) {
			System.out.println(s); 
		}
		
		//Collections.sort(sList); // Error because Student object is not Comparable
		
		//Collections.sort(sList, new RollNoComparator());
		
		Collections.sort(sList, new NameComparator());
		
		System.out.println("***********After Sorting**********");
		for(Student s : sList) {
			System.out.println(s); 
		}
		
		
		/*List<String> list = new ArrayList<>();
		list.add("PATNA");
		list.add("HYDERABAD");
		list.add("KOLKATA");
		list.add("DELHI");
		
		Collections.sort(list);
		
		for(String t : list) {
			System.out.println(t); 
		}*/
		
	}

}
