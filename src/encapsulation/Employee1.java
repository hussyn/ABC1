package encapsulation;

public class Employee1 {
    private String lastName;
    private String firstName;
    private String empId;
    private int age;
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    // method for getting full name
    public String getFullName(){
     return this.firstName + " " + this.lastName;
    }  


public static void main(String[] args) {
	  Employee1 emp = new Employee1();
	  /*This line will give compiler error
	  age field can't be used directly as it is private */
	  // emp.age = 40;
	     emp.setEmpId("E001");
	     emp.setAge(40);
	     emp.setFirstName("Ram");
	     emp.setLastName("Chandra");
	     System.out.println("Age- " + emp.getAge());
	     System.out.println("Employee ID- " + emp.getEmpId());
	     System.out.println("Full Name- " + emp.getFullName());

	 }
	}