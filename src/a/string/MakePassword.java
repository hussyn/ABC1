package a.string;
//Example using methods of String class
//The following program generates a password for a student using his initials and age
public class MakePassword {
	public static void main(String[] args) {
		String firstName = "Amr";
		String middleName = "Samir";
		String lastName = "Ibrahim";
		
		//extract initials
		String initials = 
		     firstName.substring(0,1)+
		     middleName.substring(0,1)+
		     lastName.substring(0,1);
		     
		//append age
		int age = 20;
		
		String password = initials.toLowerCase()+age;
		
		System.out.println("Your Password ="+password);
	}
}
