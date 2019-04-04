import java.util.Scanner;
class Employee {
	private int id;
	private String name;
	private float salary;
	Scanner obj = new Scanner(System.in);
	public void read() {
	
		System.out.println("Enter the id");
		id = obj.nextInt();
		System.out.println("Enter the name");
		name = obj.next();
		System.out.println("Enter the salary");
		salary = obj.nextFloat();
	}
	void calSalary() {
		float hra, da,pf;
		hra = salary*0.10f;
		da = salary*0.07f;
		pf = salary*0.05f;
		salary = salary +hra +da - pf;
	}
	void display() {
	System.out.println("Id is "+id);
	System.out.println("Name is "+name);
	System.out.println("Salary is "+salary);	
	}
}
class Manager extends Employee{
	int numberOfEmp;
	Address add = new Address();
	void readMgr() {
		read();
		System.out.println("Enter the number of emp");
		numberOfEmp = obj.nextInt();
		add.readAdd();
	}
	void disMgr(){
		display();
		System.out.println("Number of emp is "+numberOfEmp);
		add.disAdd();
	}
}
class Address {
	private String city;
	private String state;
	Scanner obj = new Scanner(System.in);
	void readAdd() {
		System.out.println("Enter the city");
		city = obj.next();
		
		System.out.println("Enter the state");
		state = obj.next();
	}
	void disAdd() {
	System.out.println("City is "+city);
	System.out.println("State is "+state);
	}
}
class EmployeeTest {
	public static void main(String args[]) {
	/*Employee emp1 = new Employee();
	emp1.read();
	emp1.calSalary();
	emp1.display();*/
	Manager mgr = new Manager();
	mgr.readMgr();
	mgr.calSalary();
	mgr.disMgr();	
	}
}