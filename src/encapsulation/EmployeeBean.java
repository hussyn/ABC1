package encapsulation;

public class EmployeeBean {
	 private String lastName;
	 private String firstName;
	 private String fullName;
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
	 public String getFullName() {
	  return fullName;
	 }
	 public void setFullName(String fullName) {
	  this.fullName = fullName;
	 }
	 
	}
