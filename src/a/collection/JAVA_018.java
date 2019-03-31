package a.collection;

public class JAVA_018
{

   public static void main(String[] args)
   {
      char Symbol='\0';

      Symbol=(char)(Math.random( )*128);

      if(Symbol>='A' && Symbol<='Z')
         System.out.println("The Random Character Generated is a Capital Letter : " + Symbol);

      else if(Symbol>='a' && Symbol<='z')
         System.out.println("The Random Character Generated is a Small Letter : " + Symbol);

      else
         System.out.println("The Random Character Generated is not a letter");
   }
}