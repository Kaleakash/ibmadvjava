import java.util.*;
class CollectionDemo2 {
	public static void main(String args[]) {
	Stack ss = new Stack();
	
	ss.push(200);
	ss.push(200);
	ss.push(200);
	ss.push(100);
	ss.push(300);
	//ss.push(100);
		ss.push(400);
	System.out.println(ss);
	System.out.println("Remove element "+ss.pop());
	System.out.println(ss);
	System.out.println("Top element "+ss.peek());
	System.out.println(ss);
	System.out.println("Search "+ss.search(100));
	System.out.println("Search "+ss.search(2000));	
	}
}