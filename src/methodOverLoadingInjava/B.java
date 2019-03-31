package methodOverLoadingInjava;

class A
{
void calculate(int x, int y)
{
int sum=x+y;
System.out.println("sum is: "+sum);
}
}
public class B extends A
{
/*void calculate(int x, int y)
{
int product=x*y;
System.out.println("product is: "+product);
}*/
public static void main(String arg[])
{
B b=new B();
b.calculate(5,4); //output=sum is:20 now after commenting calculate(int x, int y) method output=sum is: 9
}
}