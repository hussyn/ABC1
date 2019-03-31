package encapsulation;

public class Employee {

	 public EmployeeBean getEmployeeData(String empId){
	  System.out.println("Going to DB to get employee Data"); 
	  // goes to the stub method rather than going to DB
	  EmployeeBean employeeBean = getData();
	  //Will give Compilation error, data can be set only through setters method
	  //employeeBean.age = 10; 
	  String name = getFullName(employeeBean.getFirstName(), employeeBean.getLastName());
	  employeeBean.setFullName(name);
	  System.out.println("Employee bean - " + "Age - " + employeeBean.getAge() + 
	    " Name - " + employeeBean.getFullName() + " Emp ID - " + employeeBean.getEmpId());
	  return employeeBean;
	 }
	 // private method to concatenate first and last name
	 private String getFullName(String firstName, String lastName){
	  return firstName + " " + lastName;
	 }
	 
	 // Stub method 
	 private EmployeeBean getData(){
	  EmployeeBean employeeBean = new EmployeeBean();
	  employeeBean.setEmpId("E001");
	  employeeBean.setLastName("Mishra");
	  employeeBean.setFirstName("Pyaremohan");
	  employeeBean.setAge(35);
	  return employeeBean;
	 }
	 
	}