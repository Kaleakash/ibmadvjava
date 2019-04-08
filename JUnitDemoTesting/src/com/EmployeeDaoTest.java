package com;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

public class EmployeeDaoTest {

	
	@Test
	public void testStoreEmployeeInfo() {
	//EmployeeDao ed = new EmployeeDao();
	
	EmployeeDao	 ed = Mockito.mock(EmployeeDao.class);
		
	Employee emp = new Employee(1,"Raj",12000);
	
	when(ed.storeEmployeeInfo(emp)).thenReturn("Success");
	
	//when(ed.storeEmployeeInfo(emp)).thenCallRealMethod();
	
	assertEquals("Success", ed.storeEmployeeInfo(emp));
	
	}

	@Test
	public void testGetEmpInfo() {
	
	}

}
