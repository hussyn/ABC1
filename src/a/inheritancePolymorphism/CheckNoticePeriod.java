package a.inheritancePolymorphism;

//http://testingpool.com/method-overriding-in-java/
class Company{    // parent class 
	int noticePeiodInMonths(){
		return 1;
	}
}
 
class IBM extends Company{    // parent class 
	int noticePeiodInMonths(){
		return 2;
	}
}
 
class Yahoo extends Company{    // parent class 
	int noticePeiodInMonths(){
		return 3;
	}
}
 
public class CheckNoticePeriod{  
	
	public static void main(String[] args) {
		IBM ibm  = new IBM();
		Yahoo y = new Yahoo();
		Company com=new IBM();
		Company com2 =new Company();
//		IBM com1=new Company();//Type mismatch: cannot convert from Company to IBM
		System.out.println("Notice period in IBM "+ibm.noticePeiodInMonths()+" months"); //2
		System.out.println("Notice period in Yahoo "+y.noticePeiodInMonths()+" months");//3
		System.out.println("Notice period in Company parent and child IBM "+com.noticePeiodInMonths());//2
		System.out.println("Notice period in Company "+com2.noticePeiodInMonths());//1
		

	}
	
}