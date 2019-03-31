package com.Encapsulation;
//-Example-Java Encapsulation and Abstraction
public class Employee {

	public int salary;
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		emp1.salary=5000;
		
		emp2.salary=6000;
		
		System.out.println(emp1.salary);
		System.out.println(emp2.salary);
		//emp1.salary is encapsulated from emp2.salary and similarly emp2.salary is encapsulated from emp1.salary
		//the salary assignment information is abstracted for other classes, but still can make use of emp1 salary.
	}
	
}
