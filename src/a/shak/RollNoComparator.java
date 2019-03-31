package a.shak;
import java.util.Comparator;

public class RollNoComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getRoll() - s2.getRoll();
	}

}

//comparator.compare(s1,s2)
// if retur value is > 0 : s1 > s2
 //                  < 0  : s1 < s2
//                   =0  : s==s2
