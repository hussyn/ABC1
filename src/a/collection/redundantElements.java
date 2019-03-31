package a.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//Find Redundant Elements in Array using ArrayList
//takes the array of elements as input and displays all the redundant elements present in the array. The program uses ArrayList to check the redundant elements by comparing all the elements in the list. If two numbers are
//found to be equal add the element to the ArrayList after making sure that the element is not already present in the ArrayList.

class redundantElements
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList al = new ArrayList();
        int flag = 0;
        System.out.println("Enter the number of elements: ");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    if(al.contains(arr[i]))
                    {
                        continue;
                    }
                    else
                    {
                        al.add(arr[i]);
                    }
                }
            }
             
        }
        System.out.print(al);
    }
}
