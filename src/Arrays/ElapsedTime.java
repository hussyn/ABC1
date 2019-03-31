package Arrays;

import java.util.Scanner;

public class ElapsedTime 
{
 
    public static void main(String[] args) 
    {
        long startTime; //start time
        long endTime;   //end time
        double time;    //time difference
         
        startTime = System.currentTimeMillis();
        System.out.println("startTime:  " + startTime);
        //doing some operation
        //read and print your name      
        System.out.print("Enter you name: ");
        //Scanner class object
        Scanner SC=new Scanner(System.in);
        String name=SC.nextLine();
         
        System.out.println("Thanks "+ name +" ! ");
 
        endTime = System.currentTimeMillis();
        
        time = (endTime - startTime) / 1000.0;
 
        System.out.println("\nElapsed Time is:  " + time);
    }
 
}