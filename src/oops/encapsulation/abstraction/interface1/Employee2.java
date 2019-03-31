package oops.encapsulation.abstraction.interface1;
//Java Encapsulation Abstraction
//There is an Employee class with many objects. All employees have salary. One employee salary is not known to the other employee or one employee cannot change other employee salary. Let us discuss the above terms through employee example.

//emp1.salary is encapsulated from emp2.salary and similarly emp2.salary is encapsulated from emp1.salary. 
//advantage of encapsulation is emp1 cannot alter the emp2 salary and vice versa. Other classes can make use of emp1 salary of 5000 without knowing how the salary is assigned (or implemented). Other way, the salary assignment information is abstracted for other classes, but still can make use of emp1 salary.

public class Employee2 {
	
	//public String name;
	public int salary;
	
	public static void main(String[] args) {
		//creating instance of the class  
		Employee2 emp1=new Employee2();
		Employee2 emp2=new Employee2();
		emp1.salary=4000;
		emp2.salary=5000;
		System.out.println("Employee1 sal Rs:"+emp1.salary);
		System.out.println("Employee2 sal Rs:"+emp2.salary);
	}

}
