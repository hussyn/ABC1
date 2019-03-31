package oops.constructor.inheritance.polymorphism;
/*Why multiple inheritance is not supported in java?
Due to ambiguity problem java does not support multiple inheritance at class level.*/

class A{
	void display() {
		System.out.println("hello A");
	}
}

class B{
	
	void display() {
		System.out.println("hello B");
	}
}

public class C extends A,B {  //- Syntax error on tokens, AnnotationName expected 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj=new C();
		obj.display();//Now which disp() method would be invoked?  
		

	}

}
