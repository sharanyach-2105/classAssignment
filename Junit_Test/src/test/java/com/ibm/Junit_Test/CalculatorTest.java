package com.ibm.Junit_Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private Calculator calcTest;
	
	@Test
	public void testAdd() {
		int a= 35;
		int b= 20;
		calcTest = new Calculator();
		
		int expectedResult = 55;
		long result = calcTest.add(a, b);
		Assertions.assertEquals(expectedResult,result);
	}
}