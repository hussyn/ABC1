package oops.constructor.inheritance.polymorphism;


//Polymorphism=one name many form, one definition multiple implementation 
public class Polymorphism1 {
/*	Can we overload java main() method?
Yes, by method overloading. You can have any number of main methods in a class by method overloading. But JVM calls main() method which receives string array as arguments only. Let's see the simple example:
*/
		public static void main(String[] args){
			System.out.println("main with String[]");} //JVM calls main() method which receives string array as arguments only. 
		public static void main(String args){
			System.out.println("main with String");}  
		public static void main(){
			System.out.println("main without args");}  
		  

}
