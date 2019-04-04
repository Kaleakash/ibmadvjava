class ExpDemo {
	public static void main(String args[]) {
	System.out.println("Welcome");
	int a=10;
	int b =0;
	int abc[]={10,20,30};
	try{
		int res = a/b;
		System.out.println("Res "+res);
		res = abc[2]/2;
		System.out.println("Res "+res);
	}catch(Exception e) {
		System.out.println("I Take Care!");
		System.out.println(e.toString());
	}finally {
		System.out.println("finally block");
	}
	System.out.println("Bye..");
	System.out.println("Bye..");
	System.out.println("Bye..");
	}
}