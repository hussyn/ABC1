package a.string;

import java.util.Scanner;

public class ReverseString6
{
    public static void main(String[] args)
    {
        System.out.println("Enter string to reverse:");
        
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        StringBuilder sb=new StringBuilder();
  
        System.out.println("Reversed string is:");
        System.out.println(sb.reverse().toString());
    }
}