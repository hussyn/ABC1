package a.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddDeleteUpdateinLISTS {
	
   public static void main(String[] args) {
	     List<Integer> l=new ArrayList<Integer>();
        Scanner in=new Scanner(System.in);
     boolean y=true;  
     do{   
         System.out.println("Enter 1 to add a no.(non zero) in list\n2 to edit no.\n3 to search");
         System.out.println("4 to delete\n5 to check total no.\n6 to print list\n7 to exit");
         System.out.println("enter your choice");
         int choice=in.nextInt();
         switch(choice)
         {
            case 1:
                insert();
                break;
            case 2:
                edit();
                break;
            case 3:
                search();
                break;
            case 4:
                delete();
                break;
            case 5:
                total();
                break;
            case 6:
                print();
                break;
            case 7:
                toexit();
                break;
            default:
                System.out.println("bad input");
                break;
        }
        System.out.println("want to process more? y/n");
        String x=in.next();
        char ch=x.charAt(0); 
        if( ch=='n')
            y=false;
    }
    while(y!=false);
   
    }
    
    //*************************************************************************************staticpublicvoid insert(){
       
       
       Scanner in=new Scanner(System.in);
        
        boolean y=true;
       do{
            System.out.println("enter no to add in list");
            int num=in.nextInt();
            if(num==0)
                System.out.println("0 is not alowed");
            else
                l.add(num);
            System.out.println("want to insert more?y/n");
            String x=in.next();
            char ch=x.charAt(0);
            if( ch=='n')
                y=false;
         }
       while(y!=false); 
   }
   
  //*************************************************************************************8 staticpublicvoid print(){
       
       
       if(l.isEmpty())
           System.out.println("list is empty ");
       else
            System.out.println("members of lists are:");
            for(int i=0 ; i<l.size();i++)
                System.out.println("index "+i+" : "+ l.get(i)+" ");
      
   }
   
   //********************************************************************************staticpublicvoid search(){
       
       //List<Integer> I=new ArrayList<Integer>();
       System.out.println("enter no to search");
       Scanner in=new Scanner(System.in);
       
       int num=in.nextInt();
       for(int i=0;i<l.size();i++){
           if(l.get(i)==num)
                System.out.println(num+" is  PRESENT at Index "+i);
       }
         
       if(l.lastIndexOf(num)==-1)
               System.out.println(num+" is NOT PRESENT");
   }

   //*****************************************************************************8staticpublicvoid edit(){
       
       
       Scanner in=new Scanner(System.in);
       int num1,num2;
       System.out.println("enter no you want to add");
       num2=in.nextInt();
       if(num2==0)
             System.out.println("0 is not alowed");
       else{
             try{
                System.out.println("enter position you want to edit");
                num1=in.nextInt();
                l.set(num1, num2);
             }catch(IndexOutOfBoundsException e){
                    System.err.println("caught IndexOutOfBoundsException: specified position is empty "+e.getMessage());
               }
       
          }
   }
   
   
    //************************************************************************************************8staticpublicvoid delete(){
        
        
        Scanner in=new Scanner(System.in);
        System.out.println("enter position you want to delete");
        int num=in.nextInt();
        l.remove(num);
        
    }
    
    
     //***********************************************************************88staticpublicvoid total(){
        
        
        System.out.println("total no. in list are "+ l.size());
    }
    
    //******************************************************************************staticpublicvoid toexit(){
        
        System.exit(0);
    }
}
}
