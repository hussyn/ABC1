package a.AccessModifiers1;

import a.AccessModifiers.Addition;

public class DefaultAccessModifierTest {
	public static void main(String[] args) {
		
	
	Addition add=new Addition();
	add.addTwoNumbers2(10, 21);// method addTwoNumbers2(int, int) from the type Addition is not visible .Since we didn't mention any access modifier here, it would be considered as default.

}
}