package oops.constructor.inheritance.polymorphism;
//Example of Multilevel Inheritance
 class Employee4 {
	float total_sal=0;
	float basic_sal=30000;

}

class HRA extends Employee4{
	
	float hra=4000;
	
}
class DA extends HRA{
	//float DA=(hra*.20f);
	float DA=2000;
}

class Programmer4 extends DA{
	float bonus=1000;
	
	public static void main(String[] args) {
		Programmer4 prog=new Programmer4();
		prog.total_sal=prog.basic_sal+prog.hra+prog.DA+prog.bonus;
		System.out.println("programmer total_sal "+prog.total_sal);
	}
}