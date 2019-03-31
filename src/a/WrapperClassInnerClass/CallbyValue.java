package a.WrapperClassInnerClass;

//If we pass object in place of any primitive value, original value will be changed. In this example we are passing object as a value
public class CallbyValue {

	int data=50;
	void change(CallbyValue obj) {
		obj.data = obj.data+100;//changes will be in the instance variable  
	}
	public static void main(String[] args) {
		CallbyValue obj=new CallbyValue();

	System.out.println(obj.data);
	obj.change(obj);//passing object 
	System.out.println(obj.data);
	}

}
