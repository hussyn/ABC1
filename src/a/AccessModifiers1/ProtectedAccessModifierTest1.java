package a.AccessModifiers1;

import a.AccessModifiers.Addition;
//in another package is able to call the method, which is declared protected.
//This is because the Test class extends class e.g Addition and the protected modifier allows the access of protected members in subclasses (in any packages).
public class ProtectedAccessModifierTest1  {
	
	public static void main(String[] args) {
		
	
		Addition add =new Addition();
		System.out.println(add.addTwoNumbers1(5, 3));//The method subtracttwoNumbers(int, int) is undefined for the type ProtectedAccessModifierTest1
		
}}
