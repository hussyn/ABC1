package a.interfaces;

interface transport{
    void bus();
}

interface payment{
     void online();
}

//public class college  implements transport{//child class access interface by using ----> implements keyword
 public class college  implements transport,payment{//Multiple interface:
	 @Override
	 public void bus() {
	 	System.out.println("student should travel by bus");
	 	
	 } 
   
     @Override
     public void online() {
    	 System.out.println("payment by online");
     	
     }
     
  public static void main(String args[]){
     college c=new  college();
     
	 c.bus();
	 c.online();
	 }




	}