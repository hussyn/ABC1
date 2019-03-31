package array;

import java.util.Arrays;

public class FindRepeatedNumbers {

	public static void main(String[] args) 
    {
     int num[]={1,3,2,4,1,2,4,6,7,5};
     //Arrays.sort(a);
           Arrays.sort(num);

  for(int j=1;j<num.length;j++)
      {
       if(num[j]==num[j-1])
    {
            System.out.println(num[j]);

       }
   }

       }
     
}
