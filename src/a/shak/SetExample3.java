package a.shak;
import java.util.Set;
import java.util.TreeSet;

// TreeSet - no duplicates,not index based,  sorted

public class SetExample3 {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		
		set.add("Pune");
		set.add("Delhi");
		set.add("Kolkata");
		set.add("Chennai");
		set.add("Mumbai");
		
		for(String t : set) {
			System.out.println(t);
		}
		
		Set<Student> students = new TreeSet<>(new RollNoComparator());
		students.add(new Student(103,"Abc",5.4));
		students.add(new Student(101,"Def",5.5));
		students.add(new Student(102,"Pqr",5.3));
		
		for(Student st  : students) {
			System.out.println(st);
		}
		
	}

}
