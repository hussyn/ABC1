package a.collection;
//Code for Even number ,Prime no. ,Factorial of a number in Java
public class myclass {
    public  boolean isEven(int num){
        boolean iseven;
        if(num%2==0)
            iseven=true;
        else
            iseven=false;
        return iseven;
    }
    public  boolean isPrime(int num){
        boolean p=true;
        if(num==2||num==3||num==1)
           p=true; 
        else for(int i=2;i<num;i++)
              {
                if(num%i==0){
                    p=false;
                    break;
                }
              }
       return p; 
    }
    public static int fact(int num){
        int facto=1;
        for(int i=num;i>=1;i--){
            facto=facto*i;
        }
        return facto;
    }
    
}