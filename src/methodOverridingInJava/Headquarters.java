package methodOverridingInJava;

public class Company{

	public static void main(String args[])
	{
			
		Mainbranch M=new Mainbranch();//only the inherited class was instantiated and we now invoke the getDetails() and showDetails() method of the Headquarters class with the help of Super Keyword
		M.getDetails(); //When this method is called, first it will invoke the getDetails() method of Headquarters and then will progress to the Mainbranch class.
		M.showDetails();//Similary , first this method will show the details of Headquarters Class and then it will progress to the Mainbranch class.
	}
}

class Headquarters
{
	int totalemployees; // Data Member 1
	String cityname; // Data Member 2
	Scanner KB=new Scanner(System.in);
	void getDetails()
	{
		System.out.println("Enter City Where Headquarters is Sitiuated :");
		cityname=KB.nextLine();
		System.out.println("Enter Total Number of Employees in Headquarters");
		totalemployees=KB.nextInt();
	}
	void showDetails()
	{
		System.out.println("Company Headquarters is Sitiuated in "+cityname+" and has "+totalemployees+" Employees");
	}
}

class Mainbranch extends Headquarters
{	
	int totalMBemployees;
	String citynameMB;
	
	void getDetails()
	{  
		System.out.println("Headquarters:");
		super.getDetails();
		System.out.println("Main Branch:");
		System.out.println("Enter City Where Main Branch is Sitiuated");
		KB.nextLine();//to understand why we used this statement visit my first article at this LINK
		citynameMB=KB.nextLine();
		System.out.println("Enter The Total Number of Employees In Main Branch");
		totalMBemployees=KB.nextInt();
	}
	
	void showDetails()
	{	
		System.out.println("Headquarters:");
		super.showDetails();
		System.out.println("Main Branch:");
		System.out.println("Company Main Branch is Sitiuated in "+citynameMB+" and has "+totalMBemployees+" Employees");
	}
}
