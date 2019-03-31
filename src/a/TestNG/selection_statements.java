package a.TestNG;


	 public class selection_statements {
        public static void main(String args[])
        {
            int var1 = 5; 
            int var2 = 6;
            int var3 = 1;
            
            System.out.println(++var3);
            System.out.println(var3);
            System.out.println(var3++);
            
            if ((var2 = 1) == var1)
                System.out.print(var2);
            else 
                System.out.print(++var2);
        } 
    
}
