
package com.okdevtv.tdd.calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		int result = calculator.add(1,2); 
		assertEquals(3, result);
	}
	
	@Test
	public void testSubtract() {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(1,2);
		assertEquals(-1, result);
	}
	
	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

}
