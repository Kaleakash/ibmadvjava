class Operation {
	void add(int x, int y){
	System.out.println(x+y);	
	}
	void add(int x, int y, int z) {
	System.out.println(x+y+z);	
	}
	void add(int x) {
	System.out.println(x);
	}
	void add(String s1, String s2) {
	System.out.println(s1+s2);	
	}
}
class MethodOverloading {
	public static void main(String args[]) {
	Operation op = new Operation();
	op.add(1);
	op.add(10,20);
	op.add("Raj","Deep");
	op.add(1,2,3);
	}
}