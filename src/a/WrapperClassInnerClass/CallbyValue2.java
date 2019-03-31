package a.WrapperClassInnerClass;

public class CallbyValue2 {

	int data=50;
	
	 void change(int data) {
		 	data=data+10;
		 	//return data;
	}
	 
	public static void main(String[] args) {
		CallbyValue2 val=new CallbyValue2();

		System.out.println(val.data);
		val.change(500);

		System.out.println(val.data);
	}

}
