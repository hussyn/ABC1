package com.Encapsulation;

public class Employee1 {

	public int salary;
	public int bounus;
	
	public void Employee1(int salary,int bounus) {
		this.salary=salary;
		this.bounus=bounus;	
	}
	
	public void setsalary(int salary) {
		if(salary<0) {
			System.out.println("Invalid Salary");
		}else {
		this.salary=salary;	}
	}
	
	public void setBounus(int bounus) {
		this.bounus=bounus;
	}
	
	public int  getSalary() {
		
		return salary;
	}
	
	public int getBonus() {
		return bounus;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 emp2=new Employee1();
		Employee1 emp3=new Employee1();
		 emp2.Employee1(5000, 500);
		 emp3.Employee1(6000, 500);
	}

}
