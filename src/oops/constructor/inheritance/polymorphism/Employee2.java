package oops.constructor.inheritance.polymorphism;

//Constructor-is block of code similar to method but without return type
//name of the constructor and class name should be same.
// constructor canot be abstract,static ,final,synchronished.
// we can use access modifier while declaring constructor
//there are two type of constructor
// 1)default constructor
//2) parameterized constructor

//Copy Constructor-There is no copy constructor in java. However, we can copy the values from one object to another like copy constructor in C++.
public class Employee2 {
	
	String name;
	String emailid;
	int empid;
	double salary;
	

	//creating three arg constructor -
	////constructor to initialize string, integer and double  
	public Employee2(String name,int empid,double salary) {
		this.name=name;
		this.emailid=emailid;
		this.empid=empid;
		this.salary=salary;
		System.out.println("Employee name:"+name+" Empid:"+empid+" Salary:"+salary);
	}
	public Employee2(String name,String emailid,int empid,double salary) {
		this.name=name;
		this.emailid=emailid;
		this.empid=empid;
		this.salary=salary;
		System.out.println("Employee name:"+name+" mailid:"+emailid+"Empid:"+empid+"Salary:"+salary);
	}
	
	////constructor to initialize another object  
	 public Employee2(Employee2 emp) {
		 this.name=emp.name;
		 this.empid=emp.empid;
		 this.salary=emp.salary;
		
		 System.out.println("Employee name:"+name+" Empid:"+empid+" Salary:"+salary);
	}
	public static void main(String[] args) {
		 Employee2 emp=new Employee2("sajjad", 101, 15000.00);
		 //Employee2 emp1=new Employee2("sajjad1", "s1@gamil.com", 102, 20000.00);
		 
		 Employee2 copyemp=new Employee2(emp);
		 
	}


}
