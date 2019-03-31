package a.loop;

public class ContinueExample2 {  
public static void main(String[] args) {  
            //outer loop 
			aa:
            for(int iRow=1;iRow<=57;iRow++)
            {    
                    //inner loop 
            	    bb: 
                    for(int jCol=1;jCol<=6;jCol++){  
                    	System.out.println("forcondition:="+iRow+" "+jCol); 
                    	 if((iRow == 5 && jCol == 6) || (iRow == 10 && jCol == 6)|| (iRow == 15 && jCol == 6)|| (iRow == 20 && jCol == 6)|| (iRow == 25 && jCol == 6)|| (iRow == 30 && jCol == 6)|| (iRow == 35 && jCol == 6)|| (iRow == 40 && jCol == 6)|| (iRow == 45 && jCol == 6)|| (iRow == 50 && jCol == 6)|| (iRow == 55 && jCol == 6)) {
         					
                      		System.out.println("pagination_next.click()");
                         	System.out.println(" if condition:="+iRow+" "+jCol); 
                         	//break bb;
                    	                            }
                    	  //break ;
                    	  //continue bb;
                    							  }   

                    	// System.out.println("="+jCol+" "+jCol);
                    	
             } 
					
            }
}
