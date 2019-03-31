package methodOverLoadingInjava;

public class OperatorExample{  
public static void main(String args[]){  
int a=10;  
int b=10; 
System.out.println(++a);//11 
System.out.println(a++);//11 
System.out.println(0 + b++ + b++);//10+11=21  

//new data
System.out.println(a++ + ++a);//10+12=22  
System.out.println(b++ + b++);//10+11=21  
}}