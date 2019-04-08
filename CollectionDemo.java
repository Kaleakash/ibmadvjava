import java.util.*;
class Employee {}
class Manager{
	@Override
	public String toString() {
		return "Manager class Object ";
	}
}
class CollectionDemo {
	public static void main(String args[]) {
	HashSet hs = new HashSet();
	int a=10;
	Integer b = new Integer(a);	// converting int to Integer 
	hs.add(b);
	hs.add(20);   //auto-boxing : converting primitive to object. 
	hs.add(10.10);
	hs.add("Raj");
	hs.add(true);
	hs.add(new Employee());
	Manager mgr = new Manager();
	System.out.println(mgr);
	hs.add(mgr);
	System.out.println(hs);
	}
}