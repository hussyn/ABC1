package a.string;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwapTwoStringsWithout3rdVar {
	
	@Test 
	public void Testcase1() {
	String s1 = "abc";
	String s2 = "def";
	
	s1 = s1.concat(s2);
	s2 = s1.substring(0,s1.length()-s2.length());
	s1 = s1.substring(s2.length());
}}
