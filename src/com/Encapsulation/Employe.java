package com.Encapsulation;

public class Employe {

		private int salary;
		private int bonus;
		
		void calculateSalary(){
			int totalSalary;
			
			totalSalary = salary + bonus;
			
			System.out.println("Total Salary "+ totalSalary);
		}
	 
		//Getter to get the value of salary variable
		public int getSalary() {
			return salary;
		}
	 
		//Setter to set the value of salary variable 
		//with a check of negative value
		public void setSalary(int salary) {
			if(salary<0){
				System.err.println("Invalid Salary");
			} else {
			this.salary = salary;
			}
		}
	 
		//Getter to get the value of bonus variable
		public int getBonus() {
			return bonus;
		}
	 
		//Setter to set the value of bonus variable 
		//with a check of negative value
		public void setBonus(int bonus) {
			if(bonus<0){
				System.err.println("Invalid bonus");
			} else {
			this.bonus = bonus;
			}
		}		
}
