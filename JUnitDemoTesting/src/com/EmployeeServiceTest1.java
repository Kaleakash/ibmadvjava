package com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeServiceTest1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Only once before all test method");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Only once After all test method");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before testing");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After testing");
	}

	@Test(timeout=5000)
	public void testStoreEmpInfo() {
		//fail("Not yet implemented");
		System.out.println("store emp Info testing");
	}

	@Test
	public void testGetEmpInfo() {
		//fail("Not yet implemented");
		System.out.println("get emp Info testing");
	}

}
