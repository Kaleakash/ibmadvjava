interface Abc {
int A=0;
	void dis1();
}
interface Mno {
int B =0;
	void dis2();
}
interface Xyz extends Abc,Mno{
int C=0;
void dis3();
}
class Demo implements Abc,Mno {
	public void dis1() {
		System.out.println("Abc interface method");
	}
	public void dis2() {
		System.out.println("Xyz interface method");
	}
}

class InterfaceDemo {
	public static void main(String args[]) {
	Demo obj = new Demo();
	obj.dis1();
	obj.dis2();
	}
}