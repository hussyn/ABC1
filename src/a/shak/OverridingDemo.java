package a.shak;
//12 sep
class X{
	void f1() {	System.out.println("X.f1");	}
}


class Y extends X {
	
	@Override
	void f1() {System.out.println("Y.f1");}
	
	void f2() {System.out.println("Y.f2");}
}

//compile+runtime
public class OverridingDemo {
	
	public static void main(String[] args) {
		X ref = new Y(); // Super class ref can point to sub class object
		
		ref.f1();  // runtime polymporphism (dynamic binding)
		
		if(ref instanceof Y) {
			((Y)ref).f2();
		}
		
		
		/*Y obj = new Y();
		//obj.f2(); // f2 method of Y get called.
		obj.f1(); */
	}
	
	

}
