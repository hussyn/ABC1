package a.shak;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// LinkedHashSet - no duplicates, no index based, 
// order is guaranteed

public class SetExample2 {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Pune");
		set.add("Delhi");
		set.add("Kolkata");
		set.add("Chennai");
		set.add("Mumbai");
		
		for(String t : set) {
			System.out.println(t);
		}
		
		System.out.println("----------After sorting--------");
		
		TreeSet<String> tSet = new TreeSet<>();
		tSet.addAll(set);
		for(String t : tSet) {
			System.out.println(t);
		}
		
	}

}
