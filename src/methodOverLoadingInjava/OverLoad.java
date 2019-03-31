package methodOverLoadingInjava;

//Overloading simplest example

public class OverLoad
{
void sum(int x, int y)
{
int sum=x+y;
System.out.println("sum is: "+sum);
}
void sum(int x, int y, int z)
{
int sum=x+y+z;
System.out.println("sum is: "+sum);
}
public static void main(String arg[])
{
OverLoad ol=new OverLoad();
ol.sum(5,4);
ol.sum(5,4,3);
}
}