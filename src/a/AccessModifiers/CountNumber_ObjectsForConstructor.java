package a.AccessModifiers;
//Java Program to Find Out the Number of Objects Created of a Class
//Whenever an object is made of a class, its constructor is invoked. Whenever the constructor runs we increment the counter value. Hence number of objects created of a class equals to the counter value.
public class CountNumber_ObjectsForConstructor {
	static int count=0;
	CountNumber_ObjectsForConstructor()
    {
        count++;
    }
    public static void main(String[] args) 
    {
    	CountNumber_ObjectsForConstructor obj1 = new CountNumber_ObjectsForConstructor();
    	CountNumber_ObjectsForConstructor obj2 = new CountNumber_ObjectsForConstructor();
        System.out.println("Number of objects created:"+count);
    }

}
