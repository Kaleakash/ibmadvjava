package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeServiceTest {

	EmployeeService es = new EmployeeService();
	@Test
	public void testStoreEmpInfo() {
		//fail("Not yet implemented");
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Ravi");
		emp.setSalary(14000);
		String result = es.storeEmpInfo(emp);
		assertEquals("Welcome Ravi", result);
	}

	@Test
	public void testGetEmpInfo() {
		//fail("Not yet implemented");
			Employee e =es.getEmpInfo();
			assertEquals(100, e.getId());
			assertEquals("Raj", e.getName());
			assertEquals(12000, e.getSalary(),0.01);
	}

}
