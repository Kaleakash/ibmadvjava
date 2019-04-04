class Abc {
	int a;
	static int b;
	void dis1() {
		System.out.println("Non static method");
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
	static void dis2() {
		System.out.println("static method");
		Abc obj = new Abc();
		System.out.println("a "+obj.a);
		System.out.println("b "+b);
	}
}
class StaticDemo {
	public static void main(String args[]) {
	Abc obj1 = new Abc();
	obj1.dis1();
	Abc.dis2();
	obj1.dis2();
	obj1.a=10;
	Abc.b = 20;
	obj1.b = 30;	
	}
}