package oops.encapsulation.abstraction.interface1;
//Understanding the real scenario of Abstract class-we don't know about the implementation class (which is hidden to the end user),
abstract class Bank {
	
	//object is provided through method, e.g., getROI() method  
	  abstract float getROI();

}

class HDFC extends Bank{

	@Override
	float getROI() {
		// TODO Auto-generated method stub
		return 7.5f;
	}
	
class CityBank extends Bank {
	@Override
	float getROI() { 
		return 8.5f;}
	
}
	
}