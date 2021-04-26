package com.ibm.Junit_Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PositionValueTest {
	private PositionValue positionValue;
	
	@BeforeEach
	public void setup() {
		positionValue = new PositionValue();
	}
	
	@Test
	public void testRemoveA_InFirst2Position() {
		String expectingValue = "BCD";
		String actual = positionValue.removeA_InFirst2Position("AABCD");
		
		Assertions.assertEquals(expectingValue, actual);
	}

}
