package a.shak;
public class Student //implements Comparable<Student>
{
	private int roll;
	private String name;
	private double score;
	
	public Student(int roll, String name, double score) {
		super();
		this.roll = roll;
		this.name = name;
		this.score = score;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	
	@Override
	public String toString() {
		return roll+" "+name+" "+score;
	}
	
	/*@Override
	public int compareTo(Student s) {
		//return this.roll - s.roll;
		return this.name.compareTo(s.name);
	}*/
	
	// s1, s2   s1.compareTo(s2) > 0  ? s1 is greate than s2 : s1 is less than s2
	// x=50, y = 20   
	// x-y = 30
	
	
	
}
