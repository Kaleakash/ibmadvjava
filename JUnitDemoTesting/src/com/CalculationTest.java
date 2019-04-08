package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationTest {

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		Calcuation cc = new Calcuation();
		int res = cc.add(10, 20);
		//assertNotEquals(30,res);
		assertEquals(30, res);
		
	}

}
