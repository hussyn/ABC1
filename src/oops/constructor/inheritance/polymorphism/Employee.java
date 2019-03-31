package oops.constructor.inheritance.polymorphism;

//Constructor-is block of code similar to method but without return type
//name of the constructor and class name should be same.
// constructor canot be abstract,static ,final,synchronished.
// we can use access modifier while declaring constructor
//there are two type of constructor
// 1)default constructor
//2) parameterized constructor
public class Employee {
	
	String name;
	String emailid;
	int empid;
	double salary;
	
	public Employee() {//default constructor
		System.out.println("Hello! default constructor");
	}
	//creating three arg constructor  
	public Employee(String name,int empid,double salary) {
		this.name=name;
		this.emailid=emailid;
		this.empid=empid;
		this.salary=salary;
		System.out.println("Employee name:"+name+" Empid:"+empid+" Salary:"+salary);
	}
	public Employee(String name,String emailid,int empid,double salary) {
		this.name=name;
		this.emailid=emailid;
		this.empid=empid;
		this.salary=salary;
		System.out.println("Employee name:"+name+" mailid:"+emailid+"Empid:"+empid+"Salary:"+salary);
	}
	 public static void main(String[] args) {
		 Employee emp=new Employee("sajjad", 101, 15000.00);
		 Employee emp1=new Employee("sajjad1", "s1@gamil.com", 102, 20000.00);
		 
	}


}
