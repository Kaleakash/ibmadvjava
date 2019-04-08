class MyException extends Exception {
	MyException(){
		super();
	}
	MyException(String msg){
		super(msg);
	}
}
class ThrowDemo {
	public static void main(String args[]) {
	int a=10;
	int b =5;
	try {
		if(a>b){
		//throw new Exception();
		//int res = 10/0;
		//throw new ArithmeticException();
		//throw new ArithmeticException("a>b");
		//throw new MyException();
		throw new MyException("a>b");
		}

	}catch(Exception e){
		System.out.println("Catch "+e.toString());
	}
	}
}