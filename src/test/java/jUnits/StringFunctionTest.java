package jUnits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import code.StringFunctions;

public class StringFunctionTest {
	
	@Test
	public void test1() {
		
		Assertions.assertTrue(StringFunctions.isPalindrome("madam"));
	}
	

	@Test
	public void test2() {
		
		Assertions.assertFalse(StringFunctions.isPalindrome("shivani"));
	}

	
}
