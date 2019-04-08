package com;

public class EmployeeService {

	public String storeEmpInfo(Employee emp) {
		
		//database coding or file handling 
		
		return "Welcome "+emp.getName();
	}
	
	public Employee getEmpInfo() {
		
		//from database get emp info 
		
		Employee emp = new Employee(100, "Raj", 12000);
		
		return emp;
	}
}
