package oops.constructor.inheritance.polymorphism;

public class Programmer extends Employee3 {
	
	int bonus=20000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer prog=new Programmer();
		System.out.println(prog.salary);
		System.out.println(prog.bonus);
		
	}

}
